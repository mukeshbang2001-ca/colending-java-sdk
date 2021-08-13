/*
 * KrazybeeLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package in.credavenue.colenduat01api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for Error type.
 */
public class Error {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String message;

    /**
     * Default constructor.
     */
    public Error() {
    }

    /**
     * Initialization constructor.
     * @param  message  String value for message.
     */
    public Error(
            String message) {
        this.message = message;
    }

    /**
     * Getter for Message.
     * @return Returns the String
     */
    @JsonGetter("message")
    public String getMessage() {
        return message;
    }

    /**
     * Setter for Message.
     * @param message Value for String
     */
    @JsonSetter("message")
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Converts this Error into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Error [" + "message=" + message + "]";
    }

    /**
     * Builds a new {@link Error.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Error.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .message(getMessage());
        return builder;
    }

    /**
     * Class to build instances of {@link Error}.
     */
    public static class Builder {
        private String message;



        /**
         * Setter for message.
         * @param  message  String value for message.
         * @return Builder
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Builds a new {@link Error} object using the set fields.
         * @return {@link Error}
         */
        public Error build() {
            return new Error(message);
        }
    }
}
