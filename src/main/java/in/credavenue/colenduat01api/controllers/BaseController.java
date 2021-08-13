/*
 * KrazybeeLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package in.credavenue.colenduat01api.controllers;

import in.credavenue.colenduat01api.AuthManager;
import in.credavenue.colenduat01api.Configuration;
import in.credavenue.colenduat01api.exceptions.ApiException;
import in.credavenue.colenduat01api.http.client.HttpCallback;
import in.credavenue.colenduat01api.http.client.HttpClient;
import in.credavenue.colenduat01api.http.client.HttpContext;
import in.credavenue.colenduat01api.http.request.HttpRequest;
import in.credavenue.colenduat01api.http.response.HttpResponse;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

/**
 * Base class for all Controllers.
 */
public abstract class BaseController {
    protected static final String userAgent = "APIMATIC 3.0";

    /**
     * Protected variables to hold an instance of Configuration.
     */
    protected final Configuration config;

    /**
     * Protected variable to hold an instance of HttpCallback if the user provides it.
     */
    protected final HttpCallback httpCallback;

    protected Map<String, AuthManager> authManagers;

    private HttpClient httpClient;

    protected BaseController(Configuration config, HttpClient httpClient,
            Map<String, AuthManager> authManagers) {
        this(config, httpClient, authManagers, null);
    }
    
    protected BaseController(Configuration config, HttpClient httpClient,
            Map<String, AuthManager> authManagers, HttpCallback httpCallback) {
        this.config = config;
        this.httpClient = httpClient;
        this.authManagers = authManagers;
        this.httpCallback = httpCallback;
    }
    
    /**
     * Get httpCallback associated with this controller.
     * @return HttpCallback
     */
    public HttpCallback getHttpCallback() {
        return httpCallback;
    }
    
    /**
     * Shared instance of the Http client.
     * @return The shared instance of the http client 
     */
    public HttpClient getClientInstance() {
        return httpClient;
    }

    /**
     * Validates the response against HTTP errors defined at the API level.
     * @param   response    The response recieved
     * @param   context     Context of the request and the recieved response
     * @throws    ApiException    Represents error response from the server.
     */
    protected void validateResponse(HttpResponse response, HttpContext context) 
            throws ApiException {
        //get response status code to validate
        int responseCode = response.getStatusCode();
        if ((responseCode < 200) || (responseCode > 208)) { //[200,208] = HTTP OK
            throw new ApiException("HTTP Response Not OK", context);
        }

    }

    /**
     * RequestSupplier.
     */
    protected interface RequestSupplier {
        
        /**
         * Supplies the HttpRequest object.
         * @return    An object of type HttpRequest
         * @throws    ApiException    Represents error response from the server.
         * @throws    IOException    Signals that an I/O exception of some sort has occurred.
        */
        HttpRequest supply() throws ApiException, IOException;
    }

    /**
     * RequestExecutor.
     */
    protected interface RequestExecutor {

        /**
         * Execute a given HttpRequest to get the response back.
         * @param   request    The given HttpRequest to execute
         * @return  CompletableFuture of HttpResponse after execution
         */
        CompletableFuture<HttpResponse> execute(HttpRequest request);
    }

    /**
     * ResponseHandler.
     */
    protected interface ResponseHandler<T> {
        
        /**
         * Handles the response for an endpoint.
         * @param   context    HttpContext of the request and the received response
         * @return   An object of type T .
         * @throws    ApiException    Represents error response from the server.
         * @throws    IOException    Signals that an I/O exception of some sort has occurred.
         */
        T handle(HttpContext context) throws ApiException, IOException;
    }
    
    /**
     * Make an asynchronous HTTP endpoint call.
     * @param   <T>    The type of the object for response
     * @param   requestSupplier    An object of RequestSupplier to supply an instance of HttpRequest
     * @param   requestExecutor    An object of RequestExecutor to execute the given request
     * @param   responseHandler    An object of ResponseHandler to handle the endpoint response
     * @return  An object of type CompletableFuture of T
     */
    public <T> CompletableFuture<T> makeHttpCallAsync(RequestSupplier requestSupplier,
            RequestExecutor requestExecutor, ResponseHandler<T> responseHandler) {
        final HttpRequest request;
        try {
            request = requestSupplier.supply();
        } catch (Exception e) {
            CompletableFuture<T> futureResponse = new CompletableFuture<>();
            futureResponse.completeExceptionally(e);
            return futureResponse;
        }

        // Invoke request and get response
        return requestExecutor.execute(request).thenApplyAsync(response -> {
            HttpContext context = new HttpContext(request, response);
            try {
                return responseHandler.handle(context);
            } catch (Exception e) {
                throw new CompletionException(e);
            }
        });
    }
}
