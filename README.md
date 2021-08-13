
# Getting Started with Krazybee

## Introduction

### Integration document

The following are the endpoints to be called during and pre/post disbursement state of a loan.

#### Authentication

Authentication details and host will be shared privately.

#### Workflow

**Create Loan** is the initial endpoint to be called to create a loan. Loan will be processed in the background and the status of loan will be provided through the configured Webhook. However, the client can also poll the server via the **Get Loan Details** endpoint to know the loan's status(**Get Loan Details** is rate throttled and polling this API will be restricted). Loan's shall be considered rejected if proper response is not available within 10minutes.

All other endpoints are self-explanatory and can be retried upto 3 times before marking as failure.

#### Allowed Links

All Link attributes should contain

1. Accessible File Link URL which can be Public/Expiry URL/Whitelisted File Server Link(Write to tech.colending@credavenue.com for obtaining our IP address to whitelist)
2. File Link URL with Header Authentication (Header values should be shared with tech.colending@credavenue.com)

#### Allowed Fields Length

<table border="2" cellspacing="0" cellpadding="6" rules="groups" frame="hsides">


<colgroup>


<col  class="org-left" />


<col  class="org-left" />


</colgroup>
<thead>
<tr>
<th scope="col" class="org-left">Data Type</th>
<th scope="col" class="org-left">Max Length</th>
</tr>
</thead>


<tbody>
<tr>
<td class="org-left">String</td>
<td class="org-left">65,535 bytes</td>
</tr>


<tr>
<td class="org-left">Float</td>
<td class="org-left">8 bytes</td>
</tr>


<tr>
<td class="org-left">Integer</td>
<td class="org-left">4 bytes</td>
</tr>


<tr>
<td class="org-left">Date</td>
<td class="org-left">10 characters</td>
</tr>


</tbody>
</table>


### Webhooks

Webhooks can be configured for the below events

1. Loan status change
   
   Response Payload :
   {
   "product_id": "",
   "client_loan_id": "",
   "principal_amount": "",
   "interest_rate": "",
   "tenure": "",
   "tenure_frequency": "MONTHLY",
   "cibil_score": "",
   "purpose": "",
   "repayment_frequency":"",
   "number_of_repayments": "",
   "status": "",
   "principal_outstanding": "",
   "reject_reason": ""
   }
   
   Statuses : ['new', 'approved', 'rejected', 'agreement_signed', 'dropped', 'disbursement_ready', 'disbursed', 'matured', 'partner_settled']

2. Loan disbursement details (Disbursed through razorpay)
   
   Callback Payload:
   {
   "client_loan_id":"",
   "status":"borrower_disbursed",
   "disbursed_date":"",
   "utr_number":"",
   "disbursement_type":"",
   "payment_reversed": "TRUE/FALSE",
   "disbursement_amount":"",
   "investor_disbursed_amount": "",
   "partner_disbursed_amount": "",
   "differential_interest":"",
   "investor_differential_interest":"",
   "partner_differential_interest":"",
   "differential_days":"",
   "interest_start_date":"",
   "investor_processing_fee":"",
   "partner_processing_fee":"",
   "investor_stamp_duty":"",
   "partner_stamp_duty":"",
   "investor_documentation_charges":"",
   "partner_documentation_charges":""
   }

Provide the following details to configure the webhooks

1. callback URL
2. authentication for the callback URL (header authentication)

### Validations

**PAN**

- **Example:**ABGPA1232P
- **Sequence**: First five digits will be alpha, next four will be Numerical and again last single digit will be alpha

**GSTIN**

- **Example:**33AAACT2727Q1ZV
- **Sequence:**First two digits is Numerical, Next is PAN sequence as specified above, again thirteenth digit will be numerical, fourteenth digit is alpha, last digit will be alpha or numerical

**CIN**

- Example:U65929TN2017PTC117196
- Sequence:First digit is Alpha, next 5 numeric digits, next two alpha, next set of 4 numeric digits, Next 3 alpha, last 6 numeric digits

**PASSPORT**

- **Example:**A2096457
- **Sequence:**Total 8 digits, first digit is Alpha, remaining digits are numerical

**AADHAR NO**

- The standard 12 digits numerical.

**MOBILE NO**

- **Sequence:**10 numerical digits

**IFSC CODE**

- **Example:**PUNB0596600
- **Sequence:**First four alpha, next fifth digit is 0 (zero) always and last six digit is alpha/numeric. Totally 11 digits.

**PIN CODE**

- 6 numerical digits

## Building

The generated code uses a few Maven dependencies e.g., Jackson, OkHttp,
and Apache HttpClient. The reference to these dependencies is already
added in the pom.xml file will be installed automatically. Therefore,
you will need internet access for a successful build.

* In order to open the client library in Eclipse click on `File -> Import`.

![Importing SDK into Eclipse - Step 1](https://apidocs.io/illustration/java?workspaceFolder=Krazybee-Java&workspaceName=Krazybee&projectName=KrazybeeLib&rootNamespace=in.credavenue.colenduat01api&groupId=KrazybeeLib&artifactId=krazybee-lib&version=0.0.1&step=import0)

* In the import dialog, select `Existing Java Project` and click `Next`.

![Importing SDK into Eclipse - Step 2](https://apidocs.io/illustration/java?workspaceFolder=Krazybee-Java&workspaceName=Krazybee&projectName=KrazybeeLib&rootNamespace=in.credavenue.colenduat01api&groupId=KrazybeeLib&artifactId=krazybee-lib&version=0.0.1&step=import1)

* Browse to locate the folder containing the source code. Select the detected location of the project and click `Finish`.

![Importing SDK into Eclipse - Step 3](https://apidocs.io/illustration/java?workspaceFolder=Krazybee-Java&workspaceName=Krazybee&projectName=KrazybeeLib&rootNamespace=in.credavenue.colenduat01api&groupId=KrazybeeLib&artifactId=krazybee-lib&version=0.0.1&step=import2)

* Upon successful import, the project will be automatically built by Eclipse after automatically resolving the dependencies.

![Importing SDK into Eclipse - Step 4](https://apidocs.io/illustration/java?workspaceFolder=Krazybee-Java&workspaceName=Krazybee&projectName=KrazybeeLib&rootNamespace=in.credavenue.colenduat01api&groupId=KrazybeeLib&artifactId=krazybee-lib&version=0.0.1&step=import3)

## Installation

The following section explains how to use the KrazybeeLib library in a new project.

### 1. Starting a new project

For starting a new project, click the menu command `File > New > Project`.

![Add a new project in Eclipse](https://apidocs.io/illustration/java?workspaceFolder=Krazybee-Java&workspaceName=Krazybee&projectName=KrazybeeLib&rootNamespace=in.credavenue.colenduat01api&groupId=KrazybeeLib&artifactId=krazybee-lib&version=0.0.1&step=createNewProject0)

Next, choose `Maven > Maven Project` and click `Next`.

![Create a new Maven Project - Step 1](https://apidocs.io/illustration/java?workspaceFolder=Krazybee-Java&workspaceName=Krazybee&projectName=KrazybeeLib&rootNamespace=in.credavenue.colenduat01api&groupId=KrazybeeLib&artifactId=krazybee-lib&version=0.0.1&step=createNewProject1)

Here, make sure to use the current workspace by choosing `Use default Workspace location`, as shown in the picture below and click `Next`.

![Create a new Maven Project - Step 2](https://apidocs.io/illustration/java?workspaceFolder=Krazybee-Java&workspaceName=Krazybee&projectName=KrazybeeLib&rootNamespace=in.credavenue.colenduat01api&groupId=KrazybeeLib&artifactId=krazybee-lib&version=0.0.1&step=createNewProject2)

Following this, select the *quick start* project type to create a simple project with an existing class and a `main` method. To do this, choose `maven-archetype-quickstart` item from the list and click `Next`.

![Create a new Maven Project - Step 3](https://apidocs.io/illustration/java?workspaceFolder=Krazybee-Java&workspaceName=Krazybee&projectName=KrazybeeLib&rootNamespace=in.credavenue.colenduat01api&groupId=KrazybeeLib&artifactId=krazybee-lib&version=0.0.1&step=createNewProject3)

In the last step, provide a `Group Id` and `Artifact Id` as shown in the picture below and click `Finish`.

![Create a new Maven Project - Step 4](https://apidocs.io/illustration/java?workspaceFolder=Krazybee-Java&workspaceName=Krazybee&projectName=KrazybeeLib&rootNamespace=in.credavenue.colenduat01api&groupId=KrazybeeLib&artifactId=krazybee-lib&version=0.0.1&step=createNewProject4)

### 2. Add reference of the library project

The created Maven project manages its dependencies using its `pom.xml` file. In order to add a dependency on the *KrazybeeLib* client library, double click on the `pom.xml` file in the `Package Explorer`. Opening the `pom.xml` file will render a graphical view on the canvas. Here, switch to the `Dependencies` tab and click the `Add` button as shown in the picture below.

![Adding dependency to the client library - Step 1](https://apidocs.io/illustration/java?workspaceFolder=Krazybee-Java&workspaceName=Krazybee&projectName=KrazybeeLib&rootNamespace=in.credavenue.colenduat01api&groupId=KrazybeeLib&artifactId=krazybee-lib&version=0.0.1&step=testProject0)

Clicking the `Add` button will open a dialog where you need to specify KrazybeeLib in `Group Id`, krazybee-lib in `Artifact Id` and 0.0.1 in the `Version` fields. Once added click `OK`. Save the `pom.xml` file.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?workspaceFolder=Krazybee-Java&workspaceName=Krazybee&projectName=KrazybeeLib&rootNamespace=in.credavenue.colenduat01api&groupId=KrazybeeLib&artifactId=krazybee-lib&version=0.0.1&step=testProject1)

![Adding sample code](https://apidocs.io/illustration/java?workspaceFolder=Krazybee-Java&workspaceName=Krazybee&projectName=KrazybeeLib&rootNamespace=in.credavenue.colenduat01api&groupId=KrazybeeLib&artifactId=krazybee-lib&version=0.0.1&step=testProject2)

### 3. Write sample code

Once the `SimpleConsoleApp` is created, a file named `App.java` will be visible in the *Package Explorer* with a `main` method. This is the entry point for the execution of the created project.
Here, you can add code to initialize the client library and instantiate a *Controller* class. Sample code to initialize the client library and using controller methods is given in the subsequent sections.

## Test the SDK

The generated code and the server can be tested using automatically generated test cases.
JUnit is used as the testing framework and test runner.

In Eclipse, for running the tests do the following:

1. Select the project KrazybeeLib from the package explorer.
2. Select `Run -> Run as -> JUnit Test` or use `Alt + Shift + X` followed by `T` to run the Tests.

## Initialize the API Client

**_Note:_** Documentation for the client can be found [here.](/doc/client.md)

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `host` | `String` | For UAT environment<br>*Default*: `"https://colend-uat-01-api.credavenue.in/colending"` |
| `environment` | Environment | The API environment. <br> **Default: `Environment.PRODUCTION`** |
| `httpClientConfig` | `ReadonlyHttpClientConfiguration` | Http Client Configuration instance.<br>* See available [builder methods here](/doc/http-client-configuration-builder.md). |
| `apiKey` | `String` |  |

The API client can be initialized as follows:

```java
KrazybeeClient client = new KrazybeeClient.Builder()
    .httpClientConfig(configBuilder -> configBuilder
            .timeout(0))
    .customHeaderAuthenticationCredentials("api_key")
    .environment(Environment.PRODUCTION)
    .host("https://colend-uat-01-api.credavenue.in/colending")
    .build();
```

## Environments

The SDK can be configured to use a different environment for making API calls. Available environments are:

### Fields

| Name | Description |
|  --- | --- |
| production | **Default** |
| environment2 | Local |
| environment3 | Production |

## Authorization

This API uses `Custom Header Signature`.

## List of APIs

* [API](/doc/controllers/api.md)

## Classes Documentation

* [Utility Classes](/doc/utility-classes.md)
* [HttpRequest](/doc/http-request.md)
* [HttpResponse](/doc/http-response.md)
* [HttpStringResponse](/doc/http-string-response.md)
* [HttpContext](/doc/http-context.md)
* [HttpBodyRequest](/doc/http-body-request.md)
* [HttpCallback Interface](/doc/http-callback-interface.md)
* [Headers](/doc/headers.md)
* [ApiException](/doc/api-exception.md)
* [Configuration Interface](/doc/configuration-interface.md)
* [HttpClientConfiguration](/doc/http-client-configuration.md)
* [HttpClientConfiguration.Builder](/doc/http-client-configuration-builder.md)

