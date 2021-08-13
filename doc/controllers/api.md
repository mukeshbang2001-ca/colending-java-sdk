# API

```java
APIController aPIController = client.getAPIController();
```

## Class Name

`APIController`

## Methods

* [Disburse](/doc/controllers/api.md#disburse)
* [Update Repayment Schedule](/doc/controllers/api.md#update-repayment-schedule)
* [Create-Loan](/doc/controllers/api.md#create-loan)
* [GET Payment Details](/doc/controllers/api.md#get-payment-details)
* [Create Advance Collection](/doc/controllers/api.md#create-advance-collection)
* [Update Advance Collection](/doc/controllers/api.md#update-advance-collection)
* [Update Interest Accruals](/doc/controllers/api.md#update-interest-accruals)
* [Interest Accrual](/doc/controllers/api.md#interest-accrual)
* [Create Collection Entry](/doc/controllers/api.md#create-collection-entry)
* [Get Loan Details](/doc/controllers/api.md#get-loan-details)
* [Update Post Disbursement](/doc/controllers/api.md#update-post-disbursement)


# Disburse

# Disburse Loan API

This endpoint can be used to disburse the loan.

## Request Params

<table>
  <thead>
    <tr>
      <th>Field</th>
      <th>Type</th>
      <th>Format</th>
      <th>Required</th>
      <th>Description</th>
      <th>Example</th>
    </tr>
  </thead>
  <tbody>     <tr>
    <td>disbursement_date</td>
    <td>string</td>
    <td>date</td>
    <td>false</td>
    <td>Disbursement date to the end customer</td>
      <td>2016-06-10</td> 
</tr> 
      <tr>
    <td>first_repayment_date</td>
    <td>string</td>
    <td>date</td>
    <td>true</td>
    <td>First repayment date as per repayment schedule</td>
      <td>2014-03-13</td> 
</tr> 
      <tr>
    <td>instrument_number</td>
    <td>string</td>
    <td></td>
    <td>true</td>
    <td>UTR / Cheque Number</td>
      <td>instrument_number_44</td> 
</tr> 
      <tr>
    <td>instrument_type</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>RTGS / NEFT / UPI / Cheque</td>
      <td>instrument_type_53</td> 
</tr> 
      <tr>
    <td>loan_amount</td>
    <td>number</td>
    <td>float</td>
    <td>true</td>
    <td></td>
      <td>9.881292511668622</td> 
</tr> 
      <tr>
    <td>sanction_amount</td>
    <td>number</td>
    <td>float</td>
    <td>false</td>
    <td></td>
      <td>0.8843958042013156</td> 
</tr> 
      <tr>
    <td>differential_interest_start_date</td>
    <td>string</td>
    <td>date</td>
    <td>false</td>
    <td>PreEMI Interest Due Date</td>
      <td>2019-11-09</td> 
</tr> 
      <tr>
    <td>differential_interest</td>
    <td>number</td>
    <td>float</td>
    <td>false</td>
    <td>Broken Period Interest Amount (in Rupees)</td>
      <td>3.23114387582661</td> 
</tr> 
      <tr>
    <td>processing_fee</td>
    <td>number</td>
    <td>float</td>
    <td>false</td>
    <td>Processing Fee (Inclusive of GST)</td>
      <td>1.4299243327061884</td> 
</tr> 
      <tr>
    <td>stamp_duty</td>
    <td>number</td>
    <td>float</td>
    <td>false</td>
    <td></td>
      <td>2.4815020798078544</td> 
</tr> 
      <tr>
    <td>insurance_premium_amount</td>
    <td>number</td>
    <td>float</td>
    <td>false</td>
    <td>Insurance Premium (Inclusive of GST)</td>
      <td>9.427877080418464</td> 
</tr> 
      <tr>
    <td>documentation_fee</td>
    <td>number</td>
    <td>float</td>
    <td>false</td>
    <td>Documentation Charges (Inclusive of GST)</td>
      <td>8.194566227899582</td> 
</tr> 
      <tr>
    <td>other_charges</td>
    <td>number</td>
    <td>float</td>
    <td>false</td>
    <td>Any Other Charges (Inclusive of GST)</td>
      <td>6.960064772749501</td> 
</tr> 
      <tr>
    <td>net_disbursed_amount</td>
    <td>number</td>
    <td>float</td>
    <td>false</td>
    <td></td>
      <td>3.564242525261838</td> 
</tr> 
      <tr>
    <td>penny_test_status</td>
    <td>boolean</td>
    <td>boolean</td>
    <td>true</td>
    <td></td>
      <td>false</td> 
</tr> 
      <tr>
    <td>penny_test_report_link</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td></td>
      <td>[&quot;penny_test_report_link_18&quot;, &quot;penny_test_report_link_54&quot;]</td> 
</tr> 
  </tbody>
      </table>
## Response Codes

<table border="2" cellspacing="0" cellpadding="6" rules="groups" frame="hsides">
  <thead>
    <tr>
      <th scope="col" class="org-right">Code</th>
      <th scope="col" class="org-left">Message</th>
      <th scope="col" class="org-left">Reason</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td class="org-right">204</td>
      <td class="org-left">No content</td>
      <td class="org-left">Success</td>
    </tr>
    <tr>
      <td class="org-right">401</td>
      <td class="org-left">Unauthorized</td>
      <td class="org-left">Invalid API Key</td>
    </tr>
    <tr>
      <td class="org-right">400</td>
      <td class="org-left">Bad Request</td>
      <td class="org-left"><ul><li>Failed due to invalid request format</li>
          <li>Missing required parameters</li>
          <li>Loan is in invalid state</li>
      </td>
    </tr>
    <tr>
      <td class="org-right">404</td>
      <td class="org-left">Not found</td>
      <td class="org-left">Loan not found</td>
    </tr>
    <tr>
      <td class="org-right">500</td>
      <td class="org-left">Internal Server Error</td>
      <td class="org-left">Error occurred in the backend</td>
    </tr>
  </tbody>
</table>


```java
CompletableFuture<AgreementSigned200> disburseAsync(
    final String clientName,
    final String loanId,
    final ClientsApiLoansDisburseRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `clientName` | `String` | Template, Required | Name of the client |
| `loanId` | `String` | Template, Required | Client Loan ID as provided during loan creation |
| `body` | [`ClientsApiLoansDisburseRequest`](/doc/models/clients-api-loans-disburse-request.md) | Body, Required | - |

## Response Type

[`AgreementSigned200`](/doc/models/agreement-signed-200.md)

## Example Usage

```java
String clientName = "krazybee";
String loanId = "AB001";
ClientsApiLoansDisburseRequest body = new ClientsApiLoansDisburseRequest();
body.setDisbursementDate(LocalDate.parse("2016-06-10"));
body.setFirstRepaymentDate(LocalDate.parse("2014-03-13"));
body.setInstrumentNumber("instrument_number_44");
body.setInstrumentType("instrument_type_53");
body.setLoanAmount(9.881292511668622);
body.setSanctionAmount(0.8843958042013156);
body.setDifferentialInterestStartDate(LocalDate.parse("2019-11-09"));
body.setDifferentialInterest(3.23114387582661);
body.setProcessingFee(1.4299243327061884);
body.setStampDuty(2.4815020798078544);
body.setInsurancePremiumAmount(9.427877080418464);
body.setDocumentationFee(8.194566227899582);
body.setOtherCharges(6.960064772749501);
body.setNetDisbursedAmount(3.564242525261838);
body.setPennyTestStatus(false);
body.setPennyTestReportLink(new LinkedList<>());
body.getPennyTestReportLink().add("penny_test_report_link_18");
body.getPennyTestReportLink().add("penny_test_report_link_54");

aPIController.disburseAsync(clientName, loanId, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "client_loan_id": "AB001",
  "status": "agreement_signed"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad Request | [`BadRequestException`](/doc/models/bad-request-exception.md) |
| 401 | Unauthorized | [`UnauthorizedException`](/doc/models/unauthorized-exception.md) |
| 404 | Not Found | [`NotFoundException`](/doc/models/not-found-exception.md) |
| 500 | Internal Server Error | [`InternalServerErrorException`](/doc/models/internal-server-error-exception.md) |


# Update Repayment Schedule

# Update Repayment Schedule API

This endpoint can be used to update the loan status to agreement signed.

**Expected Loan Status: "approved"**

## Request Params

<table>
  <thead>
    <tr>
      <th>Field</th>
      <th>Type</th>
      <th>Format</th>
      <th>Required</th>
      <th>Description</th>
      <th>Example</th>
    </tr>
  </thead>
  <tbody>     <tr>
    <td>repayment_schedules</td>
    <td>array</td>
    <td></td>
    <td>true</td>
    <td></td>
      <td>{&quot;installment_no&quot;:894,&quot;due_date&quot;:&quot;2014-10-06&quot;,&quot;principal&quot;:5.732028390510626,&quot;interest&quot;:6.691993113695764,&quot;amount&quot;:7.762679261168879,&quot;pos&quot;:4.868928517165755,&quot;other_charges&quot;:3.611683700652123}</td> 
</tr> 
  </tbody>
      </table>
## Response Codes

<table border="2" cellspacing="0" cellpadding="6" rules="groups" frame="hsides">
  <thead>
    <tr>
      <th scope="col" class="org-right">Code</th>
      <th scope="col" class="org-left">Message</th>
      <th scope="col" class="org-left">Reason</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td class="org-right">204</td>
      <td class="org-left">No content</td>
      <td class="org-left">Success</td>
    </tr>
    <tr>
      <td class="org-right">401</td>
      <td class="org-left">Unauthorized</td>
      <td class="org-left">Invalid API Key</td>
    </tr>
    <tr>
      <td class="org-right">400</td>
      <td class="org-left">Bad Request</td>
      <td class="org-left"><ul><li>Failed due to invalid request format</li>
          <li>Missing required parameters</li>
          <li>Loan is in invalid state</li>
      </td>
    </tr>
    <tr>
      <td class="org-right">404</td>
      <td class="org-left">Not found</td>
      <td class="org-left">Loan not found</td>
    </tr>
    <tr>
      <td class="org-right">500</td>
      <td class="org-left">Internal Server Error</td>
      <td class="org-left">Error occurred in the backend</td>
    </tr>
  </tbody>
</table>


```java
CompletableFuture<AgreementSigned200> updateRepaymentScheduleAsync(
    final String clientName,
    final String loanId,
    final ClientsApiLoansRsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `clientName` | `String` | Template, Required | Name of the client |
| `loanId` | `String` | Template, Required | Client Loan ID as provided during loan creation |
| `body` | [`ClientsApiLoansRsRequest`](/doc/models/clients-api-loans-rs-request.md) | Body, Required | - |

## Response Type

[`AgreementSigned200`](/doc/models/agreement-signed-200.md)

## Example Usage

```java
String clientName = "krazybee";
String loanId = "AB001";
ClientsApiLoansRsRequest body = new ClientsApiLoansRsRequest();

aPIController.updateRepaymentScheduleAsync(clientName, loanId, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "client_loan_id": "AB001",
  "status": "agreement_signed"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad Request | [`BadRequestException`](/doc/models/bad-request-exception.md) |
| 401 | Unauthorized | [`UnauthorizedException`](/doc/models/unauthorized-exception.md) |
| 404 | Not Found | [`NotFoundException`](/doc/models/not-found-exception.md) |
| 500 | Internal Server Error | [`InternalServerErrorException`](/doc/models/internal-server-error-exception.md) |


# Create-Loan

# Create Loan

This API endpoint can be used to create a loan.

interest_rate: Rate of interest percent per annum

All link fields should have a valid accessible URL or NA.

States should be in INDIAN_STATES array (refer at the end of the table).

## Request Params

<table>
  <thead>
    <tr>
      <th>Field</th>
      <th>Type</th>
      <th>Format</th>
      <th>Required</th>
      <th>Description</th>
      <th>Example</th>
    </tr>
  </thead>
  <tbody>     <tr>
    <td>customer_id</td>
    <td>string</td>
    <td></td>
    <td>true</td>
    <td>Customer ID as per partner&#39;s CRM/LOS</td>
      <td>customer_id_64</td> 
</tr> 
      <tr>
    <td>client_loan_id</td>
    <td>string</td>
    <td></td>
    <td>true</td>
    <td>Loan ID as per Partner&#39;s LMS</td>
      <td>client_loan_id_22</td> 
</tr> 
      <tr>
    <td>application_id</td>
    <td>string</td>
    <td></td>
    <td>true</td>
    <td>Application ID as per Partner&#39;s CRM/LOS</td>
      <td>application_id_56</td> 
</tr> 
      <tr>
    <td>partner_branch_code</td>
    <td>string</td>
    <td></td>
    <td>true</td>
    <td>Branch Code as per Partner&#39;s LOS</td>
      <td>partner_branch_code_14</td> 
</tr> 
      <tr>
    <td>partner_branch_name</td>
    <td>string</td>
    <td></td>
    <td>true</td>
    <td>Branch Name as per Partner&#39;s LOS</td>
      <td>partner_branch_name_19</td> 
</tr> 
      <tr>
    <td>product_type</td>
    <td>string</td>
    <td></td>
    <td>true</td>
    <td></td>
      <td>product_type_89</td> 
</tr> 
      <tr>
    <td>product_id</td>
    <td>string</td>
    <td></td>
    <td>true</td>
    <td>Product Code in Co-Lending</td>
      <td>product_id_38</td> 
</tr> 
      <tr>
    <td>scheme_code</td>
    <td>string</td>
    <td></td>
    <td>true</td>
    <td></td>
      <td>scheme_code_44</td> 
</tr> 
      <tr>
    <td>loan_type</td>
    <td>string</td>
    <td></td>
    <td>true</td>
    <td>Secured / Unsecured</td>
      <td>loan_type_51</td> 
</tr> 
      <tr>
    <td>loan_subtype</td>
    <td>string</td>
    <td></td>
    <td>true</td>
    <td>BT / Top Loan / Fresh</td>
      <td>loan_subtype_72</td> 
</tr> 
      <tr>
    <td>purpose</td>
    <td>string</td>
    <td></td>
    <td>true</td>
    <td>Free flowing text</td>
      <td>purpose_88</td> 
</tr> 
      <tr>
    <td>disbursement_type</td>
    <td>string</td>
    <td></td>
    <td>true</td>
    <td>Tranche / Single</td>
      <td>disbursement_type_65</td> 
</tr> 
      <tr>
    <td>end_borrower_amount</td>
    <td>number</td>
    <td>float</td>
    <td>false</td>
    <td>In case of multiple disbursals</td>
      <td>4.790769261061881</td> 
</tr> 
      <tr>
    <td>existing_lender_amount</td>
    <td>number</td>
    <td>float</td>
    <td>false</td>
    <td>In case of multiple disbursals</td>
      <td>9.252493666252438</td> 
</tr> 
      <tr>
    <td>principal_amount</td>
    <td>number</td>
    <td>float</td>
    <td>true</td>
    <td>Total Loan Amount to the Borrower (in Rupees)</td>
      <td>2.189590631242375</td> 
</tr> 
      <tr>
    <td>interest_rate</td>
    <td>number</td>
    <td>float</td>
    <td>true</td>
    <td>Reducing balance interest rate of the customer in %. This is the interest rate to be mentioned in the sanction letter as well</td>
      <td>1.6496376763359233</td> 
</tr> 
      <tr>
    <td>tenure</td>
    <td>integer</td>
    <td></td>
    <td>true</td>
    <td>Tenure of the loan</td>
      <td>402</td> 
</tr> 
      <tr>
    <td>tenure_frequency</td>
    <td>string</td>
    <td></td>
    <td>true</td>
    <td>Daily / Weekly / Monthly</td>
      <td>tenure_frequency_26</td> 
</tr> 
      <tr>
    <td>repayment_frequency</td>
    <td>string</td>
    <td></td>
    <td>true</td>
    <td>Daily / Weekly / Monthly / Bullet</td>
      <td>repayment_frequency_19</td> 
</tr> 
      <tr>
    <td>number_of_repayments</td>
    <td>integer</td>
    <td></td>
    <td>true</td>
    <td>Number of repayments as per the repayment schedule</td>
      <td>433</td> 
</tr> 
      <tr>
    <td>first_repayment_date</td>
    <td>string</td>
    <td>date</td>
    <td>false</td>
    <td>First repayment date as per the repayment schedule (YYYY-MM-DD)</td>
      <td>2021-05-27</td> 
</tr> 
      <tr>
    <td>repayment_mode</td>
    <td>string</td>
    <td></td>
    <td>true</td>
    <td>Cash / NACH</td>
      <td>repayment_mode_41</td> 
</tr> 
      <tr>
    <td>advance_emi</td>
    <td>number</td>
    <td>float</td>
    <td>false</td>
    <td>Advance EMI Amount (If collected any)</td>
      <td>1.1084008375254994</td> 
</tr> 
      <tr>
    <td>umrn</td>
    <td>string</td>
    <td></td>
    <td>true</td>
    <td>To update if UMRN generated at this stage, else in PDD stage</td>
      <td>umrn_89</td> 
</tr> 
      <tr>
    <td>differential_interest_start_date</td>
    <td>string</td>
    <td>date</td>
    <td>false</td>
    <td>PreEMI Interest Due Date</td>
      <td>2015-10-17</td> 
</tr> 
      <tr>
    <td>differential_interest</td>
    <td>number</td>
    <td>float</td>
    <td>false</td>
    <td>Broken Period Interest Amount (in Rupees)</td>
      <td>1.0827602980449735</td> 
</tr> 
      <tr>
    <td>processing_fee</td>
    <td>number</td>
    <td>float</td>
    <td>false</td>
    <td>Processing Fee (Inclusive of GST)</td>
      <td>3.3610010074919137</td> 
</tr> 
      <tr>
    <td>stamp_duty</td>
    <td>number</td>
    <td>float</td>
    <td>false</td>
    <td></td>
      <td>8.33984283948441</td> 
</tr> 
      <tr>
    <td>insurance_premium_amount</td>
    <td>number</td>
    <td>float</td>
    <td>false</td>
    <td>Insurance Premium (Inclusive of GST)</td>
      <td>9.260385196274761</td> 
</tr> 
      <tr>
    <td>documentation_fee</td>
    <td>number</td>
    <td>float</td>
    <td>false</td>
    <td>Documentation Charges (Inclusive of GST)</td>
      <td>7.812172937475803</td> 
</tr> 
      <tr>
    <td>other_charges</td>
    <td>number</td>
    <td>float</td>
    <td>false</td>
    <td>Any Other Charges (Inclusive of GST)</td>
      <td>4.499749060603518</td> 
</tr> 
      <tr>
    <td>customer_type</td>
    <td>string</td>
    <td></td>
    <td>true</td>
    <td>Individual / Non-Individual</td>
      <td>customer_type_92</td> 
</tr> 
      <tr>
    <td>customer_category</td>
    <td>string</td>
    <td></td>
    <td>true</td>
    <td>Salaried / Self-Empolyed</td>
      <td>customer_category_79</td> 
</tr> 
      <tr>
    <td>first_name</td>
    <td>string</td>
    <td></td>
    <td>true</td>
    <td>First Name of the Customer</td>
      <td>first_name_10</td> 
</tr> 
      <tr>
    <td>middle_name</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>Middle Name of the Customer</td>
      <td>middle_name_40</td> 
</tr> 
      <tr>
    <td>last_name</td>
    <td>string</td>
    <td></td>
    <td>true</td>
    <td>Last Name of the Customer</td>
      <td>last_name_53</td> 
</tr> 
      <tr>
    <td>gender</td>
    <td>string</td>
    <td></td>
    <td>true</td>
    <td>M / F / O</td>
      <td>gender_57</td> 
</tr> 
      <tr>
    <td>date_of_birth</td>
    <td>string</td>
    <td>date</td>
    <td>true</td>
    <td>Date of Birth (YYYY-MM-DD)</td>
      <td>2013-04-06</td> 
</tr> 
      <tr>
    <td>age</td>
    <td>integer</td>
    <td></td>
    <td>false</td>
    <td>Age in years</td>
      <td>107</td> 
</tr> 
      <tr>
    <td>mobile_number</td>
    <td>string</td>
    <td></td>
    <td>true</td>
    <td>Mobile Number of the Customer (10 digits)</td>
      <td>mobile_number_82</td> 
</tr> 
      <tr>
    <td>personal_email_id</td>
    <td>string</td>
    <td></td>
    <td>true</td>
    <td>Personal Email ID of the Customer</td>
      <td>personal_email_id_89</td> 
</tr> 
      <tr>
    <td>official_email_id</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>Official Email ID of the Customer</td>
      <td>official_email_id_74</td> 
</tr> 
      <tr>
    <td>current_address</td>
    <td>string</td>
    <td></td>
    <td>true</td>
    <td>Free flowing text</td>
      <td>current_address_44</td> 
</tr> 
      <tr>
    <td>current_city</td>
    <td>string</td>
    <td></td>
    <td>true</td>
    <td>City in which applicant is currently residing</td>
      <td>current_city_81</td> 
</tr> 
      <tr>
    <td>current_district</td>
    <td>string</td>
    <td></td>
    <td>true</td>
    <td>District in which applicant is currently residing</td>
      <td>current_district_86</td> 
</tr> 
      <tr>
    <td>current_state</td>
    <td>string</td>
    <td></td>
    <td>true</td>
    <td>State in which applicant is currently residing</td>
      <td>current_state_65</td> 
</tr> 
      <tr>
    <td>current_pincode</td>
    <td>integer</td>
    <td></td>
    <td>true</td>
    <td>Pincode of the current address</td>
      <td>187</td> 
</tr> 
      <tr>
    <td>residence_type_current_address</td>
    <td>string</td>
    <td></td>
    <td>true</td>
    <td>Rented / Owned / Leased</td>
      <td>residence_type_current_address_15</td> 
</tr> 
      <tr>
    <td>years_of_stay_in_current_address</td>
    <td>integer</td>
    <td></td>
    <td>true</td>
    <td>How many years stayed in the current address</td>
      <td>128</td> 
</tr> 
      <tr>
    <td>permanent_address</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>Free flowing text</td>
      <td>permanent_address_29</td> 
</tr> 
      <tr>
    <td>permanent_city</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>City in which applicant is currently residing</td>
      <td>permanent_city_61</td> 
</tr> 
      <tr>
    <td>permanent_district</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>District in which applicant is currently residing</td>
      <td>permanent_district_78</td> 
</tr> 
      <tr>
    <td>permanent_state</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>State in which applicant is currently residing</td>
      <td>permanent_state_48</td> 
</tr> 
      <tr>
    <td>permanent_pincode</td>
    <td>integer</td>
    <td></td>
    <td>false</td>
    <td>Pincode of the current address</td>
      <td>510</td> 
</tr> 
      <tr>
    <td>residence_type_permanent_address</td>
    <td>string</td>
    <td></td>
    <td>true</td>
    <td>Rented / Owned / Leased</td>
      <td>residence_type_permanent_address_23</td> 
</tr> 
      <tr>
    <td>years_of_stay_in_permanent_address</td>
    <td>integer</td>
    <td></td>
    <td>true</td>
    <td>How many years stayed in the permanent address</td>
      <td>855</td> 
</tr> 
      <tr>
    <td>marital_status</td>
    <td>string</td>
    <td></td>
    <td>true</td>
    <td>Married / Unmarried</td>
      <td>marital_status_21</td> 
</tr> 
      <tr>
    <td>religion</td>
    <td>string</td>
    <td></td>
    <td>true</td>
    <td>Religion of the Customer</td>
      <td>religion_55</td> 
</tr> 
      <tr>
    <td>nationality</td>
    <td>string</td>
    <td></td>
    <td>true</td>
    <td>Nationality of the Customer</td>
      <td>nationality_79</td> 
</tr> 
      <tr>
    <td>father_name</td>
    <td>string</td>
    <td></td>
    <td>true</td>
    <td>Father Name of the Customer</td>
      <td>father_name_82</td> 
</tr> 
      <tr>
    <td>mother_name</td>
    <td>string</td>
    <td></td>
    <td>true</td>
    <td>Mother Name of the Customer</td>
      <td>mother_name_21</td> 
</tr> 
      <tr>
    <td>spouse_name</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>Spouse Name of the Customer</td>
      <td>spouse_name_50</td> 
</tr> 
      <tr>
    <td>education_qualification</td>
    <td>string</td>
    <td></td>
    <td>true</td>
    <td>Free flowing text</td>
      <td>education_qualification_22</td> 
</tr> 
      <tr>
    <td>net_monthly_income</td>
    <td>number</td>
    <td>float</td>
    <td>true</td>
    <td>Monthly Income of the Customer (in Rupees)</td>
      <td>6.555395452249776</td> 
</tr> 
      <tr>
    <td>annual_income</td>
    <td>number</td>
    <td>float</td>
    <td>true</td>
    <td>Annual Income of the Customer (in Rupees)</td>
      <td>7.6187148732719425</td> 
</tr> 
      <tr>
    <td>number_of_dependants</td>
    <td>integer</td>
    <td></td>
    <td>false</td>
    <td></td>
      <td>997</td> 
</tr> 
      <tr>
    <td>occupation</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>Salaried / Business / Retired / Self-Employed / Others</td>
      <td>occupation_54</td> 
</tr> 
      <tr>
    <td>pan_number</td>
    <td>string</td>
    <td></td>
    <td>true</td>
    <td>PAN Number of the Customer (10 digit Alphanumeric)</td>
      <td>pan_number_86</td> 
</tr> 
      <tr>
    <td>pan_link</td>
    <td>array</td>
    <td></td>
    <td>true</td>
    <td>PAN Document Link</td>
      <td>[&quot;pan_link_51&quot;, &quot;pan_link_23&quot;]</td> 
</tr> 
      <tr>
    <td>form_60_link</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td>Form 60 Doument Link (If applicable)</td>
      <td>[&quot;form_60_link_53&quot;, &quot;form_60_link_57&quot;]</td> 
</tr> 
      <tr>
    <td>aadhar_number</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>Aadhar Number of the Customer (12 digits)</td>
      <td>aadhar_number_32</td> 
</tr> 
      <tr>
    <td>aadhar_link</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td>Aadhar Document Link</td>
      <td>[&quot;aadhar_link_23&quot;, &quot;aadhar_link_32&quot;]</td> 
</tr> 
      <tr>
    <td>voter_id_number</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>Voter ID Number of the Customer</td>
      <td>voter_id_number_24</td> 
</tr> 
      <tr>
    <td>voting_id_link</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td>Voter Document Link</td>
      <td>[&quot;voting_id_link_93&quot;, &quot;voting_id_link_15&quot;]</td> 
</tr> 
      <tr>
    <td>driving_license_number</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>Driving License Number of the Customer</td>
      <td>driving_license_number_25</td> 
</tr> 
      <tr>
    <td>driving_license_link</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td>Driving License Document Link</td>
      <td>[&quot;driving_license_link_78&quot;, &quot;driving_license_link_72&quot;]</td> 
</tr> 
      <tr>
    <td>passport_number</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>Passport Number of the Customer</td>
      <td>passport_number_87</td> 
</tr> 
      <tr>
    <td>passport_link</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td>Passport Document Link</td>
      <td>[&quot;passport_link_20&quot;, &quot;passport_link_73&quot;]</td> 
</tr> 
      <tr>
    <td>video_kyc_link</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td>Video KYC of the Applicant</td>
      <td>[&quot;video_kyc_link_93&quot;, &quot;video_kyc_link_60&quot;]</td> 
</tr> 
      <tr>
    <td>video_kyc_profile_id</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>Required if video KYC is done. Profile ID of the case as per the video KYC vendor</td>
      <td>video_kyc_profile_id_64</td> 
</tr> 
      <tr>
    <td>video_kyc_account_id</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>Required if video KYC is done. Account ID of the case as per the video KYC vendor</td>
      <td>video_kyc_account_id_50</td> 
</tr> 
      <tr>
    <td>video_kyc_key</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>Required if video KYC is done. Key as per the video KYC vendor</td>
      <td>video_kyc_key_48</td> 
</tr> 
      <tr>
    <td>other_kyc_number</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>KYC Number of the Customer</td>
      <td>other_kyc_number_48</td> 
</tr> 
      <tr>
    <td>other_kyc_link</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td>KYC Image of the Customer</td>
      <td>[&quot;other_kyc_link_63&quot;, &quot;other_kyc_link_52&quot;]</td> 
</tr> 
      <tr>
    <td>rent_agreement_link</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td>Rent Agreement Document Link</td>
      <td>[&quot;rent_agreement_link_21&quot;, &quot;rent_agreement_link_35&quot;]</td> 
</tr> 
      <tr>
    <td>utility_bills_link</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td>Utility Bills Copies (If any)</td>
      <td>[&quot;utility_bills_link_52&quot;, &quot;utility_bills_link_81&quot;]</td> 
</tr> 
      <tr>
    <td>photo_link</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td>Photo Image of the Customer</td>
      <td>[&quot;photo_link_53&quot;, &quot;photo_link_28&quot;]</td> 
</tr> 
      <tr>
    <td>employment_type</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>Salaried / Self-Employed</td>
      <td>employment_type_71</td> 
</tr> 
      <tr>
    <td>employment_details_name</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td></td>
      <td>employment_details_name_73</td> 
</tr> 
      <tr>
    <td>employment_details_address</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td></td>
      <td>employment_details_address_12</td> 
</tr> 
      <tr>
    <td>employment_details_years_of_experience</td>
    <td>number</td>
    <td>float</td>
    <td>false</td>
    <td>Applicant&#39;s years of experience in the current organization</td>
      <td>8.694945909864286</td> 
</tr> 
      <tr>
    <td>employment_details_designation</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>Applicant&#39;s Current Designation</td>
      <td>employment_details_designation_86</td> 
</tr> 
      <tr>
    <td>payslip_link</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td>Last 3 Months Payslips</td>
      <td>[&quot;payslip_link_42&quot;, &quot;payslip_link_31&quot;]</td> 
</tr> 
      <tr>
    <td>tds_certificate_link</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td>Last 3 Years TDS Certificate</td>
      <td>[&quot;tds_certificate_link_62&quot;, &quot;tds_certificate_link_58&quot;]</td> 
</tr> 
      <tr>
    <td>name_of_bureau</td>
    <td>string</td>
    <td></td>
    <td>true</td>
    <td>CIBIL / Experian / Himark</td>
      <td>name_of_bureau_94</td> 
</tr> 
      <tr>
    <td>bureau_vintage</td>
    <td>integer</td>
    <td></td>
    <td>false</td>
    <td>Vintage in the bureau. Number of years from the first trade line</td>
      <td>303</td> 
</tr> 
      <tr>
    <td>bureau_score</td>
    <td>integer</td>
    <td></td>
    <td>true</td>
    <td></td>
      <td>345</td> 
</tr> 
      <tr>
    <td>bureau_report_link</td>
    <td>array</td>
    <td></td>
    <td>true</td>
    <td>Bureau Report PDF</td>
      <td>[&quot;bureau_report_link_95&quot;, &quot;bureau_report_link_82&quot;]</td> 
</tr> 
      <tr>
    <td>commercial_bureau_score</td>
    <td>integer</td>
    <td></td>
    <td>true</td>
    <td></td>
      <td>204</td> 
</tr> 
      <tr>
    <td>commercial_bureau_score_link</td>
    <td>array</td>
    <td></td>
    <td>true</td>
    <td>Commercial Bureau Document</td>
      <td>[&quot;commercial_bureau_score_link_41&quot;, &quot;commercial_bureau_score_link_39&quot;]</td> 
</tr> 
      <tr>
    <td>partner_score_on_the_customer</td>
    <td>integer</td>
    <td></td>
    <td>true</td>
    <td>Score Captured by the Partner</td>
      <td>344</td> 
</tr> 
      <tr>
    <td>total_existing_obligations</td>
    <td>integer</td>
    <td></td>
    <td>true</td>
    <td>Total Existing Obligations basis the Bureau Report</td>
      <td>385</td> 
</tr> 
      <tr>
    <td>credit_card_limit</td>
    <td>integer</td>
    <td></td>
    <td>false</td>
    <td>Total Credit Card Limit basis the Bureau Report</td>
      <td>728</td> 
</tr> 
      <tr>
    <td>number_of_credit_cards</td>
    <td>integer</td>
    <td></td>
    <td>false</td>
    <td>Total Number of Credit Cards per Bureau Report</td>
      <td>958</td> 
</tr> 
      <tr>
    <td>number_of_unsecured_loans</td>
    <td>integer</td>
    <td></td>
    <td>false</td>
    <td>Total Number of Unsecured Loans per Bureau Report</td>
      <td>945</td> 
</tr> 
      <tr>
    <td>value_of_total_unsecured_loans</td>
    <td>number</td>
    <td>float</td>
    <td>false</td>
    <td></td>
      <td>1.844192799812313</td> 
</tr> 
      <tr>
    <td>number_of_loans</td>
    <td>integer</td>
    <td></td>
    <td>false</td>
    <td>Total Number of Loans per Bureau Report</td>
      <td>707</td> 
</tr> 
      <tr>
    <td>value_of_total_loans</td>
    <td>number</td>
    <td>float</td>
    <td>false</td>
    <td></td>
      <td>4.170112986449297</td> 
</tr> 
      <tr>
    <td>number_of_enquiries_3months</td>
    <td>integer</td>
    <td></td>
    <td>false</td>
    <td>Number of Enquiries in the Last 3 Months per Bureau Report</td>
      <td>567</td> 
</tr> 
      <tr>
    <td>number_of_enquiries_6months</td>
    <td>integer</td>
    <td></td>
    <td>false</td>
    <td>Number of Enquiries in the Last 6 Months per Bureau Report</td>
      <td>442</td> 
</tr> 
      <tr>
    <td>number_of_enquiries_12months</td>
    <td>integer</td>
    <td></td>
    <td>false</td>
    <td>Number of Enquiries in the Last 12 Months per Bureau Report</td>
      <td>898</td> 
</tr> 
      <tr>
    <td>number_of_writeoff_suitfiled_settled_12months</td>
    <td>integer</td>
    <td></td>
    <td>false</td>
    <td>Number of Writeoff Suitfiled Settled in the Last 12 Months</td>
      <td>269</td> 
</tr> 
      <tr>
    <td>max_dpd_tradeline_12months</td>
    <td>integer</td>
    <td></td>
    <td>false</td>
    <td>Maximum DPD Tradeline in the Last 12 Months</td>
      <td>553</td> 
</tr> 
      <tr>
    <td>max_overdue_tradeline</td>
    <td>integer</td>
    <td></td>
    <td>false</td>
    <td>Maximum Overdue Tradeline</td>
      <td>473</td> 
</tr> 
      <tr>
    <td>total_overdue_amount_12months</td>
    <td>number</td>
    <td>float</td>
    <td>true</td>
    <td>Total Overdue Amount in the Last 12 Months</td>
      <td>3.9465918505353015</td> 
</tr> 
      <tr>
    <td>loan_amount_settled_12months</td>
    <td>number</td>
    <td>float</td>
    <td>true</td>
    <td>Loan Amount Settled in the Last 12 Months</td>
      <td>9.445292413783607</td> 
</tr> 
      <tr>
    <td>nature_of_loan_settled_1</td>
    <td>string</td>
    <td></td>
    <td>true</td>
    <td></td>
      <td>nature_of_loan_settled_1_67</td> 
</tr> 
      <tr>
    <td>nature_of_loan_settled_2</td>
    <td>string</td>
    <td></td>
    <td>true</td>
    <td></td>
      <td>nature_of_loan_settled_2_27</td> 
</tr> 
      <tr>
    <td>total_emi_bounces</td>
    <td>integer</td>
    <td></td>
    <td>true</td>
    <td></td>
      <td>86</td> 
</tr> 
      <tr>
    <td>emi_bounces_6months</td>
    <td>integer</td>
    <td></td>
    <td>true</td>
    <td>EMI Bounces in the Last 6 Months</td>
      <td>188</td> 
</tr> 
      <tr>
    <td>emi_bounces_12months</td>
    <td>integer</td>
    <td></td>
    <td>false</td>
    <td>EMI Bounces in the Last 12 Months</td>
      <td>912</td> 
</tr> 
      <tr>
    <td>bank_statement_savings_account_12_months_link</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td>Savings Bank Account Statement for the Last 12 Months</td>
      <td>[&quot;bank_statement_savings_account_12_months_link_73&quot;, &quot;bank_statement_savings_account_12_months_link_77&quot;]</td> 
</tr> 
      <tr>
    <td>bank_statement_current_account_12_months_link</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td>Current Account Bank Account Statement for the Last 12 Months</td>
      <td>[&quot;bank_statement_current_account_12_months_link_32&quot;, &quot;bank_statement_current_account_12_months_link_36&quot;]</td> 
</tr> 
      <tr>
    <td>no_of_inward_chq_returns_savings_account</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td></td>
      <td>[40, 278]</td> 
</tr> 
      <tr>
    <td>no_of_outward_chq_returns_savings_account</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td></td>
      <td>[60, 320]</td> 
</tr> 
      <tr>
    <td>no_of_inward_chq_returns_current_account</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td></td>
      <td>[985, 160]</td> 
</tr> 
      <tr>
    <td>no_of_outward_chq_returns_current_account</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td></td>
      <td>[357, 806]</td> 
</tr> 
      <tr>
    <td>bank_account_type_for_assessment</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>Savings / Current / Overdraft / CC</td>
      <td>bank_account_type_for_assessment_45</td> 
</tr> 
      <tr>
    <td>perfios_link</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td>JSON of Perfios/Finbit</td>
      <td>[&quot;perfios_link_92&quot;, &quot;perfios_link_43&quot;]</td> 
</tr> 
      <tr>
    <td>abb</td>
    <td>number</td>
    <td>float</td>
    <td>true</td>
    <td>Average Bank Balance maintaiend on the EMI dates (Calculated by the Originator for the Last 12 Months)</td>
      <td>1.1627846371238137</td> 
</tr> 
      <tr>
    <td>abd</td>
    <td>number</td>
    <td>float</td>
    <td>false</td>
    <td>Average Monthly Bank Deposits for the Last 12 Months</td>
      <td>0.35063575063469243</td> 
</tr> 
      <tr>
    <td>annual_business_turnover</td>
    <td>number</td>
    <td>float</td>
    <td>true</td>
    <td>Annual Business Turnover (in Rupees)</td>
      <td>9.797496135458548</td> 
</tr> 
      <tr>
    <td>annual_gross_profit</td>
    <td>number</td>
    <td>float</td>
    <td>true</td>
    <td>Annual Gross Profit (in Rupees)</td>
      <td>7.450535816418712</td> 
</tr> 
      <tr>
    <td>annual_business_ebitda</td>
    <td>number</td>
    <td>float</td>
    <td>false</td>
    <td>Annual Business EBITDA (in Rupees)</td>
      <td>2.1756258509307935</td> 
</tr> 
      <tr>
    <td>annual_net_income</td>
    <td>number</td>
    <td>float</td>
    <td>false</td>
    <td>Annual Net Income (in Rupees)</td>
      <td>9.27507200661448</td> 
</tr> 
      <tr>
    <td>monthly_net_profit</td>
    <td>number</td>
    <td>float</td>
    <td>true</td>
    <td>Monthly Net Profit (in Rupees)</td>
      <td>4.047325658447764</td> 
</tr> 
      <tr>
    <td>annual_net_profit</td>
    <td>number</td>
    <td>float</td>
    <td>false</td>
    <td>Annual Net Profit (in Rupees)</td>
      <td>1.0414382232501918</td> 
</tr> 
      <tr>
    <td>gst_return_year_1_link</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td>GST Return Document for the Last Year</td>
      <td>[&quot;gst_return_year_1_link_100&quot;, &quot;gst_return_year_1_link_74&quot;]</td> 
</tr> 
      <tr>
    <td>gst_return_year_2_link</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td>GST Return Document for the Last Year - 1</td>
      <td>[&quot;gst_return_year_2_link_89&quot;, &quot;gst_return_year_2_link_18&quot;]</td> 
</tr> 
      <tr>
    <td>gst_return_year_3_link</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td>GST Return Document for the Last Year - 2</td>
      <td>[&quot;gst_return_year_3_link_20&quot;, &quot;gst_return_year_3_link_38&quot;]</td> 
</tr> 
      <tr>
    <td>it_return_year_1_link</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td>IT Return Document for the Last Year</td>
      <td>[&quot;it_return_year_1_link_64&quot;, &quot;it_return_year_1_link_22&quot;]</td> 
</tr> 
      <tr>
    <td>it_return_year_2_link</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td>IT Return Document for the Last Year - 1</td>
      <td>[&quot;it_return_year_2_link_52&quot;, &quot;it_return_year_2_link_93&quot;]</td> 
</tr> 
      <tr>
    <td>it_return_year_3_link</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td>IT Return Document for the Last Year - 2</td>
      <td>[&quot;it_return_year_3_link_70&quot;, &quot;it_return_year_3_link_20&quot;]</td> 
</tr> 
      <tr>
    <td>other_income_assessment_proof_link</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td>Kachcha/Pucca Bill Copies</td>
      <td>[&quot;other_income_assessment_proof_link_62&quot;, &quot;other_income_assessment_proof_link_66&quot;]</td> 
</tr> 
      <tr>
    <td>cam_link</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td>CAM Document Link</td>
      <td>[&quot;cam_link_33&quot;, &quot;cam_link_29&quot;]</td> 
</tr> 
      <tr>
    <td>cfa_link</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td>CFA Document Link</td>
      <td>[&quot;cfa_link_28&quot;, &quot;cfa_link_90&quot;]</td> 
</tr> 
      <tr>
    <td>co_applicants</td>
    <td>array</td>
    <td></td>
    <td>true</td>
    <td></td>
      <td>{&quot;relationship_with_applicant&quot;:&quot;relationship_with_applicant_33&quot;,&quot;first_name&quot;:&quot;first_name_12&quot;,&quot;middle_name&quot;:&quot;middle_name_52&quot;,&quot;last_name&quot;:&quot;last_name_57&quot;,&quot;gender&quot;:&quot;gender_99&quot;,&quot;date_of_birth&quot;:&quot;2016-01-14&quot;,&quot;age&quot;:225,&quot;mobile_number&quot;:&quot;mobile_number_10&quot;,&quot;email&quot;:&quot;email_40&quot;,&quot;current_address&quot;:&quot;current_address_53&quot;,&quot;current_city&quot;:&quot;current_city_58&quot;,&quot;current_district&quot;:&quot;current_district_50&quot;,&quot;current_state&quot;:&quot;current_state_95&quot;,&quot;current_pincode&quot;:762,&quot;residence_type_current_address&quot;:&quot;residence_type_current_address_40&quot;,&quot;years_of_stay_in_current_address&quot;:564,&quot;permanent_address&quot;:&quot;permanent_address_59&quot;,&quot;permanent_city&quot;:&quot;permanent_city_15&quot;,&quot;permanent_district&quot;:&quot;permanent_district_57&quot;,&quot;permanent_state&quot;:&quot;permanent_state_83&quot;,&quot;permanent_pincode&quot;:50,&quot;residence_type_permanent_address&quot;:&quot;residence_type_permanent_address_86&quot;,&quot;years_of_stay_in_permanent_address&quot;:112,&quot;marital_status&quot;:&quot;marital_status_18&quot;,&quot;religion&quot;:&quot;religion_66&quot;,&quot;nationality&quot;:&quot;nationality_100&quot;,&quot;father_name&quot;:&quot;father_name_47&quot;,&quot;mother_name&quot;:&quot;mother_name_53&quot;,&quot;spouse_name&quot;:&quot;spouse_name_49&quot;,&quot;education_qualification&quot;:&quot;education_qualification_45&quot;,&quot;annual_income&quot;:4.0943412399236525,&quot;income_proof_link&quot;:[&quot;income_proof_link_68&quot;,&quot;income_proof_link_33&quot;],&quot;bank_statement_12_months_link&quot;:[&quot;bank_statement_12_months_link_32&quot;,&quot;bank_statement_12_months_link_67&quot;],&quot;pan_number&quot;:&quot;pan_number_10&quot;,&quot;pan_link&quot;:[&quot;pan_link_25&quot;,&quot;pan_link_44&quot;],&quot;aadhar_number&quot;:&quot;aadhar_number_83&quot;,&quot;aadhar_link&quot;:[&quot;aadhar_link_52&quot;,&quot;aadhar_link_14&quot;],&quot;voter_id_number&quot;:&quot;voter_id_number_72&quot;,&quot;voting_id_link&quot;:[&quot;voting_id_link_83&quot;,&quot;voting_id_link_94&quot;],&quot;driving_license_number&quot;:&quot;driving_license_number_19&quot;,&quot;driving_license_link&quot;:[&quot;driving_license_link_26&quot;,&quot;driving_license_link_71&quot;],&quot;passport_number&quot;:&quot;passport_number_82&quot;,&quot;passport_link&quot;:[&quot;passport_link_39&quot;,&quot;passport_link_20&quot;],&quot;video_kyc_link&quot;:[&quot;video_kyc_link_76&quot;,&quot;video_kyc_link_57&quot;],&quot;video_kyc_profile_id&quot;:&quot;video_kyc_profile_id_75&quot;,&quot;video_kyc_account_id&quot;:&quot;video_kyc_account_id_66&quot;,&quot;video_kyc_key&quot;:&quot;video_kyc_key_23&quot;,&quot;other_kyc_number&quot;:&quot;other_kyc_number_33&quot;,&quot;other_kyc_link&quot;:[&quot;other_kyc_link_57&quot;,&quot;other_kyc_link_24&quot;],&quot;rent_agreement_link&quot;:[&quot;rent_agreement_link_25&quot;,&quot;rent_agreement_link_93&quot;],&quot;utility_bills_link&quot;:[&quot;utility_bills_link_72&quot;,&quot;utility_bills_link_98&quot;],&quot;photo_link&quot;:[&quot;photo_link_78&quot;,&quot;photo_link_58&quot;],&quot;bureau_score&quot;:530,&quot;bureau_report_link&quot;:[&quot;bureau_report_link_62&quot;,&quot;bureau_report_link_33&quot;],&quot;partner_score_on_the_coapplicant&quot;:305}</td> 
</tr> 
      <tr>
    <td>abb_emi_ratio</td>
    <td>number</td>
    <td>float</td>
    <td>true</td>
    <td></td>
      <td>7.713022412682655</td> 
</tr> 
      <tr>
    <td>dscr</td>
    <td>number</td>
    <td>float</td>
    <td>true</td>
    <td>Debt Service Coverage Ratio</td>
      <td>6.85637452353696</td> 
</tr> 
      <tr>
    <td>foir</td>
    <td>number</td>
    <td>float</td>
    <td>true</td>
    <td>Fixed Obligations to Income Ratio</td>
      <td>1.797283215340434</td> 
</tr> 
      <tr>
    <td>ltr</td>
    <td>number</td>
    <td>float</td>
    <td>true</td>
    <td>Loan Transfer Ratio</td>
      <td>3.5472989214683457</td> 
</tr> 
      <tr>
    <td>eligibility_loan_amount</td>
    <td>number</td>
    <td>float</td>
    <td>false</td>
    <td></td>
      <td>6.2659354850325375</td> 
</tr> 
      <tr>
    <td>credit_insurance_insurer</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>Insurer Name (If Credit Shield Insurance is taken)</td>
      <td>credit_insurance_insurer_43</td> 
</tr> 
      <tr>
    <td>credit_insurance_nominee_details</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>Name of the Nominee (If Credit Shield Insurance is taken)</td>
      <td>credit_insurance_nominee_details_22</td> 
</tr> 
      <tr>
    <td>credit_insurance_relationship</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>Relationship of the Nominee (If Credit Shield Insurance is taken)</td>
      <td>credit_insurance_relationship_90</td> 
</tr> 
      <tr>
    <td>credit_insurance_premium</td>
    <td>number</td>
    <td>float</td>
    <td>false</td>
    <td>Premium Amount (If Credit Shield Insurance is taken)</td>
      <td>6.196516291035245</td> 
</tr> 
      <tr>
    <td>credit_insurance_amount</td>
    <td>number</td>
    <td>float</td>
    <td>false</td>
    <td>Total Insurance Amount (If Credit Shield Insurance is taken)</td>
      <td>1.8323697551488094</td> 
</tr> 
      <tr>
    <td>credit_insurance_policy_number</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>Policy Number (If Credit Shield Insurance is taken)</td>
      <td>credit_insurance_policy_number_97</td> 
</tr> 
      <tr>
    <td>asset_insurance_insurer</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>Insurer Name</td>
      <td>asset_insurance_insurer_43</td> 
</tr> 
      <tr>
    <td>asset_insurance_nominee_details</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>Name of the Nominee</td>
      <td>asset_insurance_nominee_details_96</td> 
</tr> 
      <tr>
    <td>asset_insurance_premium</td>
    <td>number</td>
    <td>float</td>
    <td>false</td>
    <td>Premium Amount (in Rupees)</td>
      <td>4.171199141197459</td> 
</tr> 
      <tr>
    <td>asset_insurance_amount</td>
    <td>number</td>
    <td>float</td>
    <td>false</td>
    <td>Total Insurance Amount (in Rupees)</td>
      <td>9.554095281000901</td> 
</tr> 
      <tr>
    <td>asset_insurance_policy_number</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td></td>
      <td>asset_insurance_policy_number_72</td> 
</tr> 
      <tr>
    <td>psl_flag</td>
    <td>string</td>
    <td></td>
    <td>true</td>
    <td></td>
      <td>psl_flag_38</td> 
</tr> 
      <tr>
    <td>psl_description</td>
    <td>string</td>
    <td></td>
    <td>true</td>
    <td></td>
      <td>psl_description_43</td> 
</tr> 
      <tr>
    <td>psl_code</td>
    <td>string</td>
    <td></td>
    <td>true</td>
    <td></td>
      <td>psl_code_34</td> 
</tr> 
      <tr>
    <td>psl_proof_link</td>
    <td>array</td>
    <td></td>
    <td>true</td>
    <td></td>
      <td>[&quot;psl_proof_link_10&quot;, &quot;psl_proof_link_89&quot;]</td> 
</tr> 
      <tr>
    <td>disbursement_accounts</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td></td>
      <td>{&quot;account_no&quot;:&quot;account_no_61&quot;,&quot;ifsc_code&quot;:&quot;ifsc_code_59&quot;,&quot;account_type&quot;:&quot;account_type_65&quot;,&quot;account_name&quot;:&quot;account_name_74&quot;,&quot;entity_type&quot;:&quot;entity_type_88&quot;,&quot;bank_name&quot;:&quot;bank_name_47&quot;,&quot;bank_branch_name&quot;:&quot;bank_branch_name_21&quot;,&quot;amount&quot;:7.8644111560541194}</td> 
</tr> 
      <tr>
    <td>loan_agreement_link</td>
    <td>array</td>
    <td></td>
    <td>true</td>
    <td></td>
      <td>[&quot;loan_agreement_link_19&quot;, &quot;loan_agreement_link_46&quot;]</td> 
</tr> 
      <tr>
    <td>sanction_letter_link</td>
    <td>array</td>
    <td></td>
    <td>true</td>
    <td></td>
      <td>[&quot;sanction_letter_link_70&quot;, &quot;sanction_letter_link_48&quot;]</td> 
</tr> 
      <tr>
    <td>laf_link</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td></td>
      <td>[&quot;laf_link_28&quot;, &quot;laf_link_58&quot;]</td> 
</tr> 
      <tr>
    <td>self_declaration_letter_link</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td></td>
      <td>[&quot;self_declaration_letter_link_27&quot;, &quot;self_declaration_letter_link_22&quot;]</td> 
</tr> 
      <tr>
    <td>authorisation_letter_link</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td></td>
      <td>[&quot;authorisation_letter_link_52&quot;, &quot;authorisation_letter_link_14&quot;]</td> 
</tr> 
      <tr>
    <td>enach_pdc_link</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td></td>
      <td>[&quot;enach_pdc_link_75&quot;, &quot;enach_pdc_link_43&quot;]</td> 
</tr> 
      <tr>
    <td>guarantor_agreements_link</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td></td>
      <td>[&quot;guarantor_agreements_link_91&quot;, &quot;guarantor_agreements_link_83&quot;]</td> 
</tr> 
  </tbody>
      </table>
## Response Codes

<table border="2" cellspacing="0" cellpadding="6" rules="groups" frame="hsides">
  <thead>
    <tr>
      <th scope="col" class="org-right">Code</th>
      <th scope="col" class="org-left">Message</th>
      <th scope="col" class="org-left">Reason</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td class="org-right">201</td>
      <td class="org-left">Created</td>
      <td class="org-left">Success</td>
    </tr>
    <tr>
      <td class="org-right">400</td>
      <td class="org-left">Bad Request</td>
      <td class="org-left"><ul><li>Invalid request format</li>
          <li>Missing required params</li>
      </ul></td>
    </tr>
    <tr>
      <td class="org-right">401</td>
      <td class="org-left">Unauthorized</td>
      <td class="org-left">Invalid API Key</td>
    </tr>
    <tr>
      <td class="org-right">422</td>
      <td class="org-left">Unprocessable Entity</td>
      <td class="org-left"><ul>
          <li>Client Loan Already Taken</li>
          <li>Product Not Found</li>
          <li>Document not found/accessible</li>
      </td>
    </tr>
    <tr>
      <td class="org-right">500</td>
      <td class="org-left">Internal Server Error</td>
      <td class="org-left">Error occurred in the backend</td>
    </tr>
  </tbody>
</table>
## INDIAN STATES

- jammu_kashmir
- himachal_pradesh
- punjab
- chandigarh
- uttaranchal
- haryana
- delhi
- rajasthan
- uttar_pradesh
- bihar
- sikkim
- arunachal_pradesh
- nagaland
- manipur
- mizoram
- tripura
- meghalaya
- assam
- west_bengal
- jharkhand
- orissa
- chhattisgarh
- madhya_pradesh
- gujarat
- daman_diu
- dadra_nagar_haveli
- maharashtra
- andhra_pradesh
- karnataka
- goa
- lakshadweep
- kerala
- tamil_nadu
- pondicherry
- andaman_nicobar_islands
- telangana

```java
CompletableFuture<CreateLoan201> createLoanAsync(
    final String clientName,
    final ClientsApiLoansRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `clientName` | `String` | Template, Required | Name of the client |
| `body` | [`ClientsApiLoansRequest`](/doc/models/clients-api-loans-request.md) | Body, Required | - |

## Response Type

[`CreateLoan201`](/doc/models/create-loan-201.md)

## Example Usage

```java
String clientName = "krazybee";
ClientsApiLoansRequest body = new ClientsApiLoansRequest();
body.setClientLoanId("client_loan_id2");
body.setInterestRate(221.96);

aPIController.createLoanAsync(clientName, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "client_loan_id": "AB001",
  "status": "new"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad Request | [`BadRequestException`](/doc/models/bad-request-exception.md) |
| 401 | Unauthorized | [`UnauthorizedException`](/doc/models/unauthorized-exception.md) |
| 422 | Client_id already taken | [`CreateLoan422Exception`](/doc/models/create-loan-422-exception.md) |
| 500 | Internal Server Error | [`InternalServerErrorException`](/doc/models/internal-server-error-exception.md) |


# GET Payment Details

# GET Payment Details

This API endpoint can be used to get the Payment details.

## Response Codes

<table border="2" cellspacing="0" cellpadding="6" rules="groups" frame="hsides">
<colgroup>
<col  class="org-right" />
<col  class="org-left" />
<col  class="org-left" />
</colgroup>
<thead>
<tr>
<th scope="col" class="org-right">Code</th>
<th scope="col" class="org-left">Message</th>
<th scope="col" class="org-left">Reason</th>
</tr>
</thead>
<tbody>
<tr>
<td class="org-right">200</td>
<td class="org-left">OK</td>
<td class="org-left">Success</td>
</tr>
<tr>
<td class="org-right">401</td>
<td class="org-left">Unauthorized</td>
<td class="org-left">Invalid API Key</td>
</tr>
<tr>
<td class="org-right">404</td>
<td class="org-left">Not found</td>
<td class="org-left">Loan not found</td>
</tr>
<tr>
<td class="org-right">500</td>
<td class="org-left">Internal Server Error</td>
<td class="org-left">Error occurred in the backend</td>
</tr>
</tbody>
</table>


```java
CompletableFuture<List<GetPayment200>> gETPaymentDetailsAsync(
    final String clientName,
    final String loanId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `clientName` | `String` | Template, Required | Name of the client |
| `loanId` | `String` | Template, Required | Client Loan ID as provided during loan creation |

## Response Type

[`List<GetPayment200>`](/doc/models/get-payment-200.md)

## Example Usage

```java
String clientName = "krazybee";
String loanId = "AB001";

aPIController.gETPaymentDetailsAsync(clientName, loanId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
[
  {
    "id": 92135,
    "reference_no": "null",
    "paid_date": "2020-09-22T00:00:00Z",
    "principal": 50249,
    "interest": 502,
    "other_charges": 0,
    "amount": 50751,
    "comment": "Repayment",
    "created_at": "2020-09-23T04:26:24.133Z",
    "updated_at": "2020-09-23T04:26:24.133Z",
    "overdue_charges": 0,
    "penalty_charges": 0,
    "fee_charges": 0,
    "bounce_charges": 0,
    "investor_transfer_date": "2020-09-22",
    "emi_closed": true,
    "foreclosure": false,
    "payment_type": "normal",
    "installment_no": 2
  },
  {
    "id": 92133,
    "reference_no": "null",
    "paid_date": "2020-09-22T00:00:00Z",
    "principal": 49751,
    "interest": 1000,
    "other_charges": 0,
    "amount": 50751,
    "comment": "Repayment",
    "created_at": "2020-09-22T07:57:42.009Z",
    "updated_at": "2020-09-22T07:57:42.009Z",
    "overdue_charges": 0,
    "penalty_charges": 0,
    "fee_charges": 0,
    "bounce_charges": 0,
    "investor_transfer_date": "2020-09-22",
    "emi_closed": true,
    "foreclosure": false,
    "payment_type": "normal",
    "installment_no": 1
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Unauthorized | [`UnauthorizedException`](/doc/models/unauthorized-exception.md) |
| 404 | Not Found | [`NotFoundException`](/doc/models/not-found-exception.md) |
| 500 | Internal Server Error | [`InternalServerErrorException`](/doc/models/internal-server-error-exception.md) |


# Create Advance Collection

# Advance Collection API

This endpoint can be used to update the loan status to agreement signed.

**Expected Loan Status: "approved"**

## Request Params

<table>
  <thead>
    <tr>
      <th>Field</th>
      <th>Type</th>
      <th>Format</th>
      <th>Required</th>
      <th>Description</th>
      <th>Example</th>
    </tr>
  </thead>
  <tbody>     <tr>
    <td>instrument_number</td>
    <td>string</td>
    <td></td>
    <td>true</td>
    <td>UTR / Cheque Number</td>
      <td>instrument_number_43</td> 
</tr> 
      <tr>
    <td>instrument_type</td>
    <td>string</td>
    <td></td>
    <td>true</td>
    <td>RTGS / NEFT / UPI / Cheque</td>
      <td>instrument_type_13</td> 
</tr> 
      <tr>
    <td>transaction_type</td>
    <td>string</td>
    <td></td>
    <td>true</td>
    <td>Credit / Refund</td>
      <td>transaction_type_55</td> 
</tr> 
      <tr>
    <td>amount</td>
    <td>number</td>
    <td>float</td>
    <td>true</td>
    <td></td>
      <td>3.1060698857470537</td> 
</tr> 
      <tr>
    <td>transaction_date</td>
    <td>string</td>
    <td>date</td>
    <td>true</td>
    <td>Date when customer paid the amount (YYYY-MM-DD)</td>
      <td>2021-04-22</td> 
</tr> 
      <tr>
    <td>investor_transfer_date</td>
    <td>string</td>
    <td>date</td>
    <td>false</td>
    <td>Date when originator transferred the amount to investor (YYYY-MM-DD)</td>
      <td>2015-12-11</td> 
</tr> 
      <tr>
    <td>advance_outstanding</td>
    <td>number</td>
    <td>float</td>
    <td>true</td>
    <td>Before this collection record to mention advance outstanding for that loan</td>
      <td>1.8167180515891557</td> 
</tr> 
      <tr>
    <td>comment</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td></td>
      <td>comment_15</td> 
</tr> 
  </tbody>
      </table>
## Response Codes

<table border="2" cellspacing="0" cellpadding="6" rules="groups" frame="hsides">
  <thead>
    <tr>
      <th scope="col" class="org-right">Code</th>
      <th scope="col" class="org-left">Message</th>
      <th scope="col" class="org-left">Reason</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td class="org-right">204</td>
      <td class="org-left">No content</td>
      <td class="org-left">Success</td>
    </tr>
    <tr>
      <td class="org-right">401</td>
      <td class="org-left">Unauthorized</td>
      <td class="org-left">Invalid API Key</td>
    </tr>
    <tr>
      <td class="org-right">400</td>
      <td class="org-left">Bad Request</td>
      <td class="org-left"><ul><li>Failed due to invalid request format</li>
          <li>Missing required parameters</li>
          <li>Loan is in invalid state</li>
      </td>
    </tr>
    <tr>
      <td class="org-right">404</td>
      <td class="org-left">Not found</td>
      <td class="org-left">Loan not found</td>
    </tr>
    <tr>
      <td class="org-right">500</td>
      <td class="org-left">Internal Server Error</td>
      <td class="org-left">Error occurred in the backend</td>
    </tr>
  </tbody>
</table>


```java
CompletableFuture<AgreementSigned200> createAdvanceCollectionAsync(
    final String clientName,
    final String loanId,
    final ClientsApiLoansAdvancePaymentsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `clientName` | `String` | Template, Required | Name of the client |
| `loanId` | `String` | Template, Required | Client Loan ID as provided during loan creation |
| `body` | [`ClientsApiLoansAdvancePaymentsRequest`](/doc/models/clients-api-loans-advance-payments-request.md) | Body, Required | - |

## Response Type

[`AgreementSigned200`](/doc/models/agreement-signed-200.md)

## Example Usage

```java
String clientName = "krazybee";
String loanId = "AB001";
ClientsApiLoansAdvancePaymentsRequest body = new ClientsApiLoansAdvancePaymentsRequest();
body.setInstrumentNumber("instrument_number_43");
body.setInstrumentType("instrument_type_13");
body.setTransactionType("transaction_type_55");
body.setAmount(3.1060698857470537);
body.setTransactionDate(LocalDate.parse("2021-04-22"));
body.setInvestorTransferDate(LocalDate.parse("2015-12-11"));
body.setAdvanceOutstanding(1.8167180515891557);
body.setComment("comment_15");

aPIController.createAdvanceCollectionAsync(clientName, loanId, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "client_loan_id": "AB001",
  "status": "agreement_signed"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad Request | [`BadRequestException`](/doc/models/bad-request-exception.md) |
| 401 | Unauthorized | [`UnauthorizedException`](/doc/models/unauthorized-exception.md) |
| 404 | Not Found | [`NotFoundException`](/doc/models/not-found-exception.md) |
| 500 | Internal Server Error | [`InternalServerErrorException`](/doc/models/internal-server-error-exception.md) |


# Update Advance Collection

# Update Advance Collection API

This endpoint can be used to update the loan status to agreement signed.

**Expected Loan Status: "approved"**

## Request Params

<table>
  <thead>
    <tr>
      <th>Field</th>
      <th>Type</th>
      <th>Format</th>
      <th>Required</th>
      <th>Description</th>
      <th>Example</th>
    </tr>
  </thead>
  <tbody>     <tr>
    <td>investor_transfer_date</td>
    <td>string</td>
    <td>date</td>
    <td>false</td>
    <td>Date when originator transferred the amount to investor (YYYY-MM-DD)</td>
      <td>2017-06-28</td> 
</tr> 
  </tbody>
      </table>
## Response Codes

<table border="2" cellspacing="0" cellpadding="6" rules="groups" frame="hsides">
  <thead>
    <tr>
      <th scope="col" class="org-right">Code</th>
      <th scope="col" class="org-left">Message</th>
      <th scope="col" class="org-left">Reason</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td class="org-right">204</td>
      <td class="org-left">No content</td>
      <td class="org-left">Success</td>
    </tr>
    <tr>
      <td class="org-right">401</td>
      <td class="org-left">Unauthorized</td>
      <td class="org-left">Invalid API Key</td>
    </tr>
    <tr>
      <td class="org-right">400</td>
      <td class="org-left">Bad Request</td>
      <td class="org-left"><ul><li>Failed due to invalid request format</li>
          <li>Missing required parameters</li>
          <li>Loan is in invalid state</li>
      </td>
    </tr>
    <tr>
      <td class="org-right">404</td>
      <td class="org-left">Not found</td>
      <td class="org-left">Loan not found</td>
    </tr>
    <tr>
      <td class="org-right">500</td>
      <td class="org-left">Internal Server Error</td>
      <td class="org-left">Error occurred in the backend</td>
    </tr>
  </tbody>
</table>


```java
CompletableFuture<AgreementSigned200> updateAdvanceCollectionAsync(
    final String clientName,
    final String loanId,
    final String advancePaymentId,
    final ClientsApiLoansAdvancePaymentsAdvancePaymentIdRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `clientName` | `String` | Template, Required | Name of the client |
| `loanId` | `String` | Template, Required | Client Loan ID as provided during loan creation |
| `advancePaymentId` | `String` | Template, Required | Advance Payment ID returned in Create Advance API |
| `body` | [`ClientsApiLoansAdvancePaymentsAdvancePaymentIdRequest`](/doc/models/clients-api-loans-advance-payments-advance-payment-id-request.md) | Body, Required | - |

## Response Type

[`AgreementSigned200`](/doc/models/agreement-signed-200.md)

## Example Usage

```java
String clientName = "krazybee";
String loanId = "AB001";
String advancePaymentId = "AB001";
ClientsApiLoansAdvancePaymentsAdvancePaymentIdRequest body = new ClientsApiLoansAdvancePaymentsAdvancePaymentIdRequest();
body.setInvestorTransferDate(LocalDate.parse("2017-06-28"));

aPIController.updateAdvanceCollectionAsync(clientName, loanId, advancePaymentId, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "client_loan_id": "AB001",
  "status": "agreement_signed"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad Request | [`BadRequestException`](/doc/models/bad-request-exception.md) |
| 401 | Unauthorized | [`UnauthorizedException`](/doc/models/unauthorized-exception.md) |
| 404 | Not Found | [`NotFoundException`](/doc/models/not-found-exception.md) |
| 500 | Internal Server Error | [`InternalServerErrorException`](/doc/models/internal-server-error-exception.md) |


# Update Interest Accruals

# Update Interest Accruals API

This endpoint can be used to update the loan status to agreement signed.

**Expected Loan Status: "approved"**

## Request Params

<table>
  <thead>
    <tr>
      <th>Field</th>
      <th>Type</th>
      <th>Format</th>
      <th>Required</th>
      <th>Description</th>
      <th>Example</th>
    </tr>
  </thead>
  <tbody>     <tr>
    <td>file_link</td>
    <td>string</td>
    <td></td>
    <td>true</td>
    <td></td>
      <td>file_link_69</td> 
</tr> 
  </tbody>
      </table>
## Response Codes

<table border="2" cellspacing="0" cellpadding="6" rules="groups" frame="hsides">
  <thead>
    <tr>
      <th scope="col" class="org-right">Code</th>
      <th scope="col" class="org-left">Message</th>
      <th scope="col" class="org-left">Reason</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td class="org-right">204</td>
      <td class="org-left">No content</td>
      <td class="org-left">Success</td>
    </tr>
    <tr>
      <td class="org-right">401</td>
      <td class="org-left">Unauthorized</td>
      <td class="org-left">Invalid API Key</td>
    </tr>
    <tr>
      <td class="org-right">400</td>
      <td class="org-left">Bad Request</td>
      <td class="org-left"><ul><li>Failed due to invalid request format</li>
          <li>Missing required parameters</li>
          <li>Loan is in invalid state</li>
      </td>
    </tr>
    <tr>
      <td class="org-right">404</td>
      <td class="org-left">Not found</td>
      <td class="org-left">Loan not found</td>
    </tr>
    <tr>
      <td class="org-right">500</td>
      <td class="org-left">Internal Server Error</td>
      <td class="org-left">Error occurred in the backend</td>
    </tr>
  </tbody>
</table>


```java
CompletableFuture<AgreementSigned200> updateInterestAccrualsAsync(
    final String clientName,
    final ClientsApiInterestAccrualRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `clientName` | `String` | Template, Required | Name of the client |
| `body` | [`ClientsApiInterestAccrualRequest`](/doc/models/clients-api-interest-accrual-request.md) | Body, Required | - |

## Response Type

[`AgreementSigned200`](/doc/models/agreement-signed-200.md)

## Example Usage

```java
String clientName = "krazybee";
ClientsApiInterestAccrualRequest body = new ClientsApiInterestAccrualRequest();
body.setFileLink("file_link_69");

aPIController.updateInterestAccrualsAsync(clientName, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "client_loan_id": "AB001",
  "status": "agreement_signed"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad Request | [`BadRequestException`](/doc/models/bad-request-exception.md) |
| 401 | Unauthorized | [`UnauthorizedException`](/doc/models/unauthorized-exception.md) |
| 404 | Not Found | [`NotFoundException`](/doc/models/not-found-exception.md) |
| 500 | Internal Server Error | [`InternalServerErrorException`](/doc/models/internal-server-error-exception.md) |


# Interest Accrual

# Interest Accrual API

This endpoint can be used to update the loan status to agreement signed.

**Expected Loan Status: "approved"**

## Request Params

<table>
  <thead>
    <tr>
      <th>Field</th>
      <th>Type</th>
      <th>Format</th>
      <th>Required</th>
      <th>Description</th>
      <th>Example</th>
    </tr>
  </thead>
  <tbody> </tbody>
      </table>
## Response Codes

<table border="2" cellspacing="0" cellpadding="6" rules="groups" frame="hsides">
  <thead>
    <tr>
      <th scope="col" class="org-right">Code</th>
      <th scope="col" class="org-left">Message</th>
      <th scope="col" class="org-left">Reason</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td class="org-right">204</td>
      <td class="org-left">No content</td>
      <td class="org-left">Success</td>
    </tr>
    <tr>
      <td class="org-right">401</td>
      <td class="org-left">Unauthorized</td>
      <td class="org-left">Invalid API Key</td>
    </tr>
    <tr>
      <td class="org-right">400</td>
      <td class="org-left">Bad Request</td>
      <td class="org-left"><ul><li>Failed due to invalid request format</li>
          <li>Missing required parameters</li>
          <li>Loan is in invalid state</li>
      </td>
    </tr>
    <tr>
      <td class="org-right">404</td>
      <td class="org-left">Not found</td>
      <td class="org-left">Loan not found</td>
    </tr>
    <tr>
      <td class="org-right">500</td>
      <td class="org-left">Internal Server Error</td>
      <td class="org-left">Error occurred in the backend</td>
    </tr>
  </tbody>
</table>


```java
CompletableFuture<AgreementSigned200> interestAccrualAsync(
    final String clientName,
    final String fileId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `clientName` | `String` | Template, Required | Name of the client |
| `fileId` | `String` | Template, Required | File ID returned in the response of upload interest accrual |

## Response Type

[`AgreementSigned200`](/doc/models/agreement-signed-200.md)

## Example Usage

```java
String clientName = "krazybee";
String fileId = "1";

aPIController.interestAccrualAsync(clientName, fileId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "client_loan_id": "AB001",
  "status": "agreement_signed"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad Request | [`BadRequestException`](/doc/models/bad-request-exception.md) |
| 401 | Unauthorized | [`UnauthorizedException`](/doc/models/unauthorized-exception.md) |
| 404 | Not Found | [`NotFoundException`](/doc/models/not-found-exception.md) |
| 500 | Internal Server Error | [`InternalServerErrorException`](/doc/models/internal-server-error-exception.md) |


# Create Collection Entry

# Create Collection API

This API endpoint can be used to create a collection entry.

You will get a 201 HTTP response if the collection entry gets created successfully.

You can even cross verify it by checking the principal outstanding in Loan Details Response.

## Request Params

<table>
  <thead>
    <tr>
      <th>Field</th>
      <th>Type</th>
      <th>Format</th>
      <th>Required</th>
      <th>Description</th>
      <th>Example</th>
    </tr>
  </thead>
  <tbody>     <tr>
    <td>installment_no</td>
    <td>integer</td>
    <td></td>
    <td>true</td>
    <td></td>
      <td>569</td> 
</tr> 
      <tr>
    <td>due_date</td>
    <td>string</td>
    <td>date</td>
    <td>true</td>
    <td></td>
      <td>2012-02-08</td> 
</tr> 
      <tr>
    <td>principal</td>
    <td>number</td>
    <td>float</td>
    <td>true</td>
    <td>Total principal amount paid for this installment</td>
      <td>2.609857965966975</td> 
</tr> 
      <tr>
    <td>interest</td>
    <td>number</td>
    <td>float</td>
    <td>true</td>
    <td>Total interest amount paid for this installement</td>
      <td>0.37115821156952555</td> 
</tr> 
      <tr>
    <td>other_charges</td>
    <td>number</td>
    <td>float</td>
    <td>true</td>
    <td></td>
      <td>4.802645536038627</td> 
</tr> 
      <tr>
    <td>overdue_charges</td>
    <td>number</td>
    <td>float</td>
    <td>true</td>
    <td></td>
      <td>7.309469665416457</td> 
</tr> 
      <tr>
    <td>penalty_charges</td>
    <td>number</td>
    <td>float</td>
    <td>true</td>
    <td></td>
      <td>6.768127408425869</td> 
</tr> 
      <tr>
    <td>fee_charges</td>
    <td>number</td>
    <td>float</td>
    <td>true</td>
    <td></td>
      <td>6.192959710186887</td> 
</tr> 
      <tr>
    <td>bounce_charges</td>
    <td>number</td>
    <td>float</td>
    <td>true</td>
    <td></td>
      <td>8.903884329134401</td> 
</tr> 
      <tr>
    <td>amount</td>
    <td>number</td>
    <td>float</td>
    <td>true</td>
    <td>Total Collection Amount</td>
      <td>4.505310265353218</td> 
</tr> 
      <tr>
    <td>payment_type</td>
    <td>string</td>
    <td></td>
    <td>true</td>
    <td>Normal / Part / Advance</td>
      <td>payment_type_54</td> 
</tr> 
      <tr>
    <td>reference_no</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>UTR / Cheque Number</td>
      <td>reference_no_29</td> 
</tr> 
      <tr>
    <td>paid_date</td>
    <td>string</td>
    <td>date</td>
    <td>true</td>
    <td>Date when customer paid the amount (YYYY-MM-DD)</td>
      <td>2017-10-01</td> 
</tr> 
      <tr>
    <td>investor_transfer_date</td>
    <td>string</td>
    <td>date</td>
    <td>false</td>
    <td>Date when originator transferred the amount to investor (YYYY-MM-DD)</td>
      <td>2018-10-28</td> 
</tr> 
      <tr>
    <td>emi_closed</td>
    <td>boolean</td>
    <td>boolean</td>
    <td>true</td>
    <td>Y / N</td>
      <td>false</td> 
</tr> 
      <tr>
    <td>foreclosure</td>
    <td>boolean</td>
    <td>boolean</td>
    <td>true</td>
    <td>Y / N</td>
      <td>false</td> 
</tr> 
      <tr>
    <td>pos</td>
    <td>number</td>
    <td>float</td>
    <td>false</td>
    <td>Before the collection record to mention pos for that loan</td>
      <td>1.942061470228953</td> 
</tr> 
      <tr>
    <td>advance_knock_off</td>
    <td>boolean</td>
    <td>boolean</td>
    <td>false</td>
    <td>Y / N (Required if advance payment is made)</td>
      <td>false</td> 
</tr> 
      <tr>
    <td>advance_outstanding</td>
    <td>number</td>
    <td>float</td>
    <td>false</td>
    <td>Before the collection record to mention advance outstanding for that loan</td>
      <td>2.1240546532235305</td> 
</tr> 
      <tr>
    <td>updated_rs</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td>Required when prepayment is made</td>
      <td>{&quot;installment_no&quot;:657,&quot;due_date&quot;:&quot;2019-06-21&quot;,&quot;principal&quot;:5.669745627810725,&quot;interest&quot;:1.916293751472613,&quot;amount&quot;:8.733634660181497,&quot;pos&quot;:1.8360467411491688,&quot;other_charges&quot;:4.974802924932136}</td> 
</tr> 
  </tbody>
      </table>
## Response Codes

<table border="2" cellspacing="0" cellpadding="6" rules="groups" frame="hsides">
<colgroup>
<col  class="org-right" />
<col  class="org-left" />
<col  class="org-left" />
</colgroup>
<thead>
<tr>
<th scope="col" class="org-right">Code</th>
<th scope="col" class="org-left">Message</th>
<th scope="col" class="org-left">Reason</th>
</tr>
</thead>
<tbody>
<tr>
<td class="org-right">201</td>
<td class="org-left">Created</td>
<td class="org-left">Success</td>
</tr>
<tr>
<td class="org-right">400</td>
<td class="org-left">Bad Request</td>
<td class="org-left"><ul><li>Invalid request format</li>
<li>Missing required params</li>
</ul</td>
</tr>
<tr>
<td class="org-right">401</td>
<td class="org-left">Unauthorized</td>
<td class="org-left">Invalid API Key</td>
</tr>
<tr>
<td class="org-right">404</td>
<td class="org-left">Not found</td>
<td class="org-left">Loan not found</td>
</tr>
<tr>
<td class="org-right">422</td>
<td class="org-left">Unprocessable Entity</td>
<td class="org-left"><ul>
<li>Sum of collection payments principal for the installment should be equal to repayment schedule's principal</li>
<li>Sum of collection payments interest for the installment should be equal to repayment schedule's interest</li>
<li>Amount is not equal to sum of Principal, Interest, Overdue Charges, Other Charges, Fee Charges, Bounce Charges</li>
<li>The installment is already paid</li>
<li>Investor Transfer Date cannot be in the future</li>
<li>Investor Transfer Date cannot be a Sunday</li>
<li>Investor transfer date cannot be less than customer transfer date</li>
<li>Paid date can't be in the future</li>
<li>Paid date can't be before loan disbursement</li>
<li>Payment's due date does not match repayment schedule's due date</li>
<li>Previous cycle is unpaid</li>
<li>Invalid Loan Status: Loan is not disbursed</li>
</ul></td>
</tr>
<tr>
<td class="org-right">500</td>
<td class="org-left">Internal Server Error</td>
<td class="org-left">Error occurred in the backend</td>
</tr>
</tbody>
</table>


```java
CompletableFuture<CreateCollection201> createCollectionEntryAsync(
    final String clientName,
    final ClientsApiPaymentsRecordPaymentRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `clientName` | `String` | Template, Required | Name of the client |
| `body` | [`ClientsApiPaymentsRecordPaymentRequest`](/doc/models/clients-api-payments-record-payment-request.md) | Body, Required | - |

## Response Type

[`CreateCollection201`](/doc/models/create-collection-201.md)

## Example Usage

```java
String clientName = "krazybee";
ClientsApiPaymentsRecordPaymentRequest body = new ClientsApiPaymentsRecordPaymentRequest();

aPIController.createCollectionEntryAsync(clientName, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "client_loan_id": "LA00175",
  "amount": 10330.0,
  "installment_no": 1,
  "emi_closed": "N"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad Request | [`BadRequestException`](/doc/models/bad-request-exception.md) |
| 401 | Unauthorized | [`UnauthorizedException`](/doc/models/unauthorized-exception.md) |
| 404 | Not Found | [`NotFoundException`](/doc/models/not-found-exception.md) |
| 500 | Internal Server Error | [`InternalServerErrorException`](/doc/models/internal-server-error-exception.md) |


# Get Loan Details

# GET Loan Details

This API endpoint can be used to get the loan details.
The possible loan status values are

## Loan Status

<table border="2" cellspacing="0" cellpadding="6" rules="groups" frame="hsides">
<colgroup>
<col  class="org-left" />
<col  class="org-left" />
</colgroup>
<thead>
<tr>
<th scope="col" class="org-left">State</th>
<th scope="col" class="org-left">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td class="org-left">new</td>
<td class="org-left">When the loan is created</td>
</tr>
<tr>
<td class="org-left">approved</td>
<td class="org-left">When the loan is approved by the investor</td>
</tr>
<tr>
<td class="org-left">rejected</td>
<td class="org-left">When the loan is rejected by the investor</td>
</tr>
<tr>
<td class="org-left">agreement_signed</td>
<td class="org-left">When end borrower agreement/EKYC is signed/collected</td>
</tr>
<tr>
<td class="org-left">disbursement_ready</td>
<td class="org-left">When investor is ready to disburse the funds</td>
</tr>
<tr>
<td class="org-left">dropped</td>
<td class="org-left">When the loan gets rejected by the investor at agreement signed state</td>
</tr>
<tr>
<td class="org-left">disbursed</td>
<td class="org-left">When the loan moves to the disbursed state by the investor from agreement signed state</td>
</tr>
<tr>
<td class="org-left">matured</td>
<td class="org-left">After closure of all installments, the loan moves to the matured state</td>
</tr>
</tbody>
</table>
## Response Codes

<table border="2" cellspacing="0" cellpadding="6" rules="groups" frame="hsides">
<colgroup>
<col  class="org-right" />
<col  class="org-left" />
<col  class="org-left" />
</colgroup>
<thead>
<tr>
<th scope="col" class="org-right">Code</th>
<th scope="col" class="org-left">Message</th>
<th scope="col" class="org-left">Reason</th>
</tr>
</thead>
<tbody>
<tr>
<td class="org-right">200</td>
<td class="org-left">OK</td>
<td class="org-left">Success</td>
</tr>
<tr>
<td class="org-right">401</td>
<td class="org-left">Unauthorized</td>
<td class="org-left">Invalid API Key</td>
</tr>
<tr>
<td class="org-right">404</td>
<td class="org-left">Not found</td>
<td class="org-left">Loan not found</td>
</tr>
<tr>
<td class="org-right">500</td>
<td class="org-left">Internal Server Error</td>
<td class="org-left">Error occurred in the backend</td>
</tr>
</tbody>
</table>


```java
CompletableFuture<GetLoan200> getLoanDetailsAsync(
    final String clientName,
    final String loanId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `clientName` | `String` | Template, Required | Name of the client |
| `loanId` | `String` | Template, Required | Client Loan ID as provided during loan creation |

## Response Type

[`GetLoan200`](/doc/models/get-loan-200.md)

## Example Usage

```java
String clientName = "krazybee";
String loanId = "AB001";

aPIController.getLoanDetailsAsync(clientName, loanId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "client_loan_id": "AB001",
  "product_id": 1,
  "principal_amount": 1000.0,
  "interest_rate": 14.0,
  "tenure": 2,
  "tenure_frequency": "monthly",
  "cibil_score": 0,
  "purpose": "",
  "repayment_frequency": "monthly",
  "number_of_repayments": 2,
  "status": "agreement_signed",
  "principal_outstanding": 1000.0,
  "reject_reason": "null",
  "applicants": [
    {
      "id": 455,
      "first_name": "Smith"
    }
  ]
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Unauthorized | [`UnauthorizedException`](/doc/models/unauthorized-exception.md) |
| 404 | Not Found | [`NotFoundException`](/doc/models/not-found-exception.md) |
| 500 | Internal Server Error | [`InternalServerErrorException`](/doc/models/internal-server-error-exception.md) |


# Update Post Disbursement

# Update Post Disbursement API

This endpoint can be used to update the loan status to agreement signed.

**Expected Loan Status: "approved"**

## Request Params

<table>
  <thead>
    <tr>
      <th>Field</th>
      <th>Type</th>
      <th>Format</th>
      <th>Required</th>
      <th>Description</th>
      <th>Example</th>
    </tr>
  </thead>
  <tbody>     <tr>
    <td>customer_type</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>Individual / Non-Individual</td>
      <td>customer_type_30</td> 
</tr> 
      <tr>
    <td>customer_category</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>Salaried / Self-Empolyed</td>
      <td>customer_category_10</td> 
</tr> 
      <tr>
    <td>first_name</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>First Name of the Customer</td>
      <td>first_name_65</td> 
</tr> 
      <tr>
    <td>middle_name</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>Middle Name of the Customer</td>
      <td>middle_name_82</td> 
</tr> 
      <tr>
    <td>last_name</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>Last Name of the Customer</td>
      <td>last_name_66</td> 
</tr> 
      <tr>
    <td>gender</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>M / F / O</td>
      <td>gender_14</td> 
</tr> 
      <tr>
    <td>date_of_birth</td>
    <td>string</td>
    <td>date</td>
    <td>false</td>
    <td>Date of Birth (YYYY-MM-DD)</td>
      <td>2020-12-25</td> 
</tr> 
      <tr>
    <td>age</td>
    <td>integer</td>
    <td></td>
    <td>false</td>
    <td>Age in years</td>
      <td>803</td> 
</tr> 
      <tr>
    <td>mobile_number</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>Mobile Number of the Customer (10 digits)</td>
      <td>mobile_number_25</td> 
</tr> 
      <tr>
    <td>personal_email_id</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>Personal Email ID of the Customer</td>
      <td>personal_email_id_75</td> 
</tr> 
      <tr>
    <td>official_email_id</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>Official Email ID of the Customer</td>
      <td>official_email_id_49</td> 
</tr> 
      <tr>
    <td>current_address</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>Free flowing text</td>
      <td>current_address_49</td> 
</tr> 
      <tr>
    <td>current_city</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>City in which applicant is currently residing</td>
      <td>current_city_32</td> 
</tr> 
      <tr>
    <td>current_district</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>District in which applicant is currently residing</td>
      <td>current_district_72</td> 
</tr> 
      <tr>
    <td>current_state</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>State in which applicant is currently residing</td>
      <td>current_state_54</td> 
</tr> 
      <tr>
    <td>current_pincode</td>
    <td>integer</td>
    <td></td>
    <td>false</td>
    <td>Pincode of the current address</td>
      <td>345</td> 
</tr> 
      <tr>
    <td>residence_type_current_address</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>Rented / Owned / Leased</td>
      <td>residence_type_current_address_49</td> 
</tr> 
      <tr>
    <td>years_of_stay_in_current_address</td>
    <td>integer</td>
    <td></td>
    <td>false</td>
    <td>How many years stayed in the current address</td>
      <td>447</td> 
</tr> 
      <tr>
    <td>permanent_address</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>Free flowing text</td>
      <td>permanent_address_69</td> 
</tr> 
      <tr>
    <td>permanent_city</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>City in which applicant is currently residing</td>
      <td>permanent_city_15</td> 
</tr> 
      <tr>
    <td>permanent_district</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>District in which applicant is currently residing</td>
      <td>permanent_district_12</td> 
</tr> 
      <tr>
    <td>permanent_state</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>State in which applicant is currently residing</td>
      <td>permanent_state_60</td> 
</tr> 
      <tr>
    <td>permanent_pincode</td>
    <td>integer</td>
    <td></td>
    <td>false</td>
    <td>Pincode of the current address</td>
      <td>180</td> 
</tr> 
      <tr>
    <td>residence_type_permanent_address</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>Rented / Owned / Leased</td>
      <td>residence_type_permanent_address_82</td> 
</tr> 
      <tr>
    <td>years_of_stay_in_permanent_address</td>
    <td>integer</td>
    <td></td>
    <td>false</td>
    <td>How many years stayed in the permanent address</td>
      <td>170</td> 
</tr> 
      <tr>
    <td>marital_status</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>Married / Unmarried</td>
      <td>marital_status_85</td> 
</tr> 
      <tr>
    <td>religion</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>Religion of the Customer</td>
      <td>religion_80</td> 
</tr> 
      <tr>
    <td>nationality</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>Nationality of the Customer</td>
      <td>nationality_70</td> 
</tr> 
      <tr>
    <td>father_name</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>Father Name of the Customer</td>
      <td>father_name_96</td> 
</tr> 
      <tr>
    <td>mother_name</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>Mother Name of the Customer</td>
      <td>mother_name_89</td> 
</tr> 
      <tr>
    <td>spouse_name</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>Spouse Name of the Customer</td>
      <td>spouse_name_75</td> 
</tr> 
      <tr>
    <td>education_qualification</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>Free flowing text</td>
      <td>education_qualification_85</td> 
</tr> 
      <tr>
    <td>net_monthly_income</td>
    <td>number</td>
    <td>float</td>
    <td>false</td>
    <td>Monthly Income of the Customer (in Rupees)</td>
      <td>7.877011107426441</td> 
</tr> 
      <tr>
    <td>annual_income</td>
    <td>number</td>
    <td>float</td>
    <td>false</td>
    <td>Annual Income of the Customer (in Rupees)</td>
      <td>9.421437195881696</td> 
</tr> 
      <tr>
    <td>number_of_dependants</td>
    <td>integer</td>
    <td></td>
    <td>false</td>
    <td></td>
      <td>482</td> 
</tr> 
      <tr>
    <td>occupation</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>Salaried / Business / Retired / Self-Employed / Others</td>
      <td>occupation_85</td> 
</tr> 
      <tr>
    <td>pan_number</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>PAN Number of the Customer (10 digit Alphanumeric)</td>
      <td>pan_number_16</td> 
</tr> 
      <tr>
    <td>pan_link</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td>PAN Document Link</td>
      <td>[&quot;pan_link_89&quot;, &quot;pan_link_99&quot;]</td> 
</tr> 
      <tr>
    <td>form_60_link</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td>Form 60 Doument Link (If applicable)</td>
      <td>[&quot;form_60_link_92&quot;, &quot;form_60_link_69&quot;]</td> 
</tr> 
      <tr>
    <td>aadhar_number</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>Aadhar Number of the Customer (12 digits)</td>
      <td>aadhar_number_61</td> 
</tr> 
      <tr>
    <td>aadhar_link</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td>Aadhar Document Link</td>
      <td>[&quot;aadhar_link_46&quot;, &quot;aadhar_link_81&quot;]</td> 
</tr> 
      <tr>
    <td>voter_id_number</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>Voter ID Number of the Customer</td>
      <td>voter_id_number_72</td> 
</tr> 
      <tr>
    <td>voting_id_link</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td>Voter Document Link</td>
      <td>[&quot;voting_id_link_55&quot;, &quot;voting_id_link_88&quot;]</td> 
</tr> 
      <tr>
    <td>driving_license_number</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>Driving License Number of the Customer</td>
      <td>driving_license_number_50</td> 
</tr> 
      <tr>
    <td>driving_license_link</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td>Driving License Document Link</td>
      <td>[&quot;driving_license_link_30&quot;, &quot;driving_license_link_21&quot;]</td> 
</tr> 
      <tr>
    <td>passport_number</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>Passport Number of the Customer</td>
      <td>passport_number_78</td> 
</tr> 
      <tr>
    <td>passport_link</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td>Passport Document Link</td>
      <td>[&quot;passport_link_48&quot;, &quot;passport_link_94&quot;]</td> 
</tr> 
      <tr>
    <td>video_kyc_link</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td>Video KYC of the Applicant</td>
      <td>[&quot;video_kyc_link_13&quot;, &quot;video_kyc_link_60&quot;]</td> 
</tr> 
      <tr>
    <td>video_kyc_profile_id</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>Required if video KYC is done. Profile ID of the case as per the video KYC vendor</td>
      <td>video_kyc_profile_id_20</td> 
</tr> 
      <tr>
    <td>video_kyc_account_id</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>Required if video KYC is done. Account ID of the case as per the video KYC vendor</td>
      <td>video_kyc_account_id_87</td> 
</tr> 
      <tr>
    <td>video_kyc_key</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>Required if video KYC is done. Key as per the video KYC vendor</td>
      <td>video_kyc_key_16</td> 
</tr> 
      <tr>
    <td>other_kyc_number</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>KYC Number of the Customer</td>
      <td>other_kyc_number_77</td> 
</tr> 
      <tr>
    <td>other_kyc_link</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td>KYC Image of the Customer</td>
      <td>[&quot;other_kyc_link_70&quot;, &quot;other_kyc_link_18&quot;]</td> 
</tr> 
      <tr>
    <td>rent_agreement_link</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td>Rent Agreement Document Link</td>
      <td>[&quot;rent_agreement_link_90&quot;, &quot;rent_agreement_link_27&quot;]</td> 
</tr> 
      <tr>
    <td>utility_bills_link</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td>Utility Bills Copies (If any)</td>
      <td>[&quot;utility_bills_link_14&quot;, &quot;utility_bills_link_22&quot;]</td> 
</tr> 
      <tr>
    <td>photo_link</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td>Photo Image of the Customer</td>
      <td>[&quot;photo_link_21&quot;, &quot;photo_link_78&quot;]</td> 
</tr> 
      <tr>
    <td>employment_type</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>Salaried / Self-Employed</td>
      <td>employment_type_24</td> 
</tr> 
      <tr>
    <td>employment_details_name</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>Employer Name</td>
      <td>employment_details_name_40</td> 
</tr> 
      <tr>
    <td>employment_details_address</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>Office Address</td>
      <td>employment_details_address_18</td> 
</tr> 
      <tr>
    <td>employment_details_years_of_experience</td>
    <td>number</td>
    <td>float</td>
    <td>false</td>
    <td>Applicant&#39;s years of experience in the current organization</td>
      <td>5.4280555177273335</td> 
</tr> 
      <tr>
    <td>employment_details_designation</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>Applicant&#39;s Current Designation</td>
      <td>employment_details_designation_61</td> 
</tr> 
      <tr>
    <td>payslip_link</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td>Last 3 Months Payslips</td>
      <td>[&quot;payslip_link_94&quot;, &quot;payslip_link_72&quot;]</td> 
</tr> 
      <tr>
    <td>tds_certificate_link</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td>Last 3 Years TDS Certificate</td>
      <td>[&quot;tds_certificate_link_98&quot;, &quot;tds_certificate_link_46&quot;]</td> 
</tr> 
      <tr>
    <td>name_of_bureau</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>CIBIL / Experian / Himark</td>
      <td>name_of_bureau_33</td> 
</tr> 
      <tr>
    <td>bureau_vintage</td>
    <td>integer</td>
    <td></td>
    <td>false</td>
    <td>Vintage in the bureau. Number of years from the first trade line</td>
      <td>541</td> 
</tr> 
      <tr>
    <td>bureau_score</td>
    <td>integer</td>
    <td></td>
    <td>false</td>
    <td></td>
      <td>783</td> 
</tr> 
      <tr>
    <td>bureau_report_link</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td>Bureau Report PDF</td>
      <td>[&quot;bureau_report_link_27&quot;, &quot;bureau_report_link_85&quot;]</td> 
</tr> 
      <tr>
    <td>commercial_bureau_score</td>
    <td>integer</td>
    <td></td>
    <td>false</td>
    <td></td>
      <td>942</td> 
</tr> 
      <tr>
    <td>commercial_bureau_score_link</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td>Commercial Bureau Document</td>
      <td>[&quot;commercial_bureau_score_link_82&quot;, &quot;commercial_bureau_score_link_72&quot;]</td> 
</tr> 
      <tr>
    <td>partner_score_on_the_customer</td>
    <td>integer</td>
    <td></td>
    <td>false</td>
    <td>Score Captured by the Partner</td>
      <td>938</td> 
</tr> 
      <tr>
    <td>total_existing_obligations</td>
    <td>integer</td>
    <td></td>
    <td>false</td>
    <td>Total Existing Obligations basis the Bureau Report</td>
      <td>74</td> 
</tr> 
      <tr>
    <td>credit_card_limit</td>
    <td>integer</td>
    <td></td>
    <td>false</td>
    <td>Total Credit Card Limit basis the Bureau Report</td>
      <td>880</td> 
</tr> 
      <tr>
    <td>number_of_credit_cards</td>
    <td>integer</td>
    <td></td>
    <td>false</td>
    <td>Total Number of Credit Cards per Bureau Report</td>
      <td>151</td> 
</tr> 
      <tr>
    <td>number_of_unsecured_loans</td>
    <td>integer</td>
    <td></td>
    <td>false</td>
    <td>Total Number of Unsecured Loans per Bureau Report</td>
      <td>487</td> 
</tr> 
      <tr>
    <td>value_of_total_unsecured_loans</td>
    <td>number</td>
    <td>float</td>
    <td>false</td>
    <td></td>
      <td>6.993667539564163</td> 
</tr> 
      <tr>
    <td>number_of_loans</td>
    <td>integer</td>
    <td></td>
    <td>false</td>
    <td>Total Number of Loans per Bureau Report</td>
      <td>847</td> 
</tr> 
      <tr>
    <td>value_of_total_loans</td>
    <td>number</td>
    <td>float</td>
    <td>false</td>
    <td></td>
      <td>4.831926611585921</td> 
</tr> 
      <tr>
    <td>number_of_enquiries_3months</td>
    <td>integer</td>
    <td></td>
    <td>false</td>
    <td>Number of Enquiries in the Last 3 Months per Bureau Report</td>
      <td>334</td> 
</tr> 
      <tr>
    <td>number_of_enquiries_6months</td>
    <td>integer</td>
    <td></td>
    <td>false</td>
    <td>Number of Enquiries in the Last 6 Months per Bureau Report</td>
      <td>541</td> 
</tr> 
      <tr>
    <td>number_of_enquiries_12months</td>
    <td>integer</td>
    <td></td>
    <td>false</td>
    <td>Number of Enquiries in the Last 12 Months per Bureau Report</td>
      <td>513</td> 
</tr> 
      <tr>
    <td>number_of_writeoff_suitfiled_settled_12months</td>
    <td>integer</td>
    <td></td>
    <td>false</td>
    <td>Number of Writeoff Suitfiled Settled in the Last 12 Months</td>
      <td>485</td> 
</tr> 
      <tr>
    <td>max_dpd_tradeline_12months</td>
    <td>integer</td>
    <td></td>
    <td>false</td>
    <td>Maximum DPD Tradeline in the Last 12 Months</td>
      <td>1000</td> 
</tr> 
      <tr>
    <td>max_overdue_tradeline</td>
    <td>integer</td>
    <td></td>
    <td>false</td>
    <td>Maximum Overdue Tradeline</td>
      <td>212</td> 
</tr> 
      <tr>
    <td>total_overdue_amount_12months</td>
    <td>number</td>
    <td>float</td>
    <td>false</td>
    <td>Total Overdue Amount in the Last 12 Months</td>
      <td>8.614892533716507</td> 
</tr> 
      <tr>
    <td>loan_amount_settled_12months</td>
    <td>number</td>
    <td>float</td>
    <td>false</td>
    <td>Loan Amount Settled in the Last 12 Months</td>
      <td>3.0829691356942246</td> 
</tr> 
      <tr>
    <td>nature_of_loan_settled_1</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td></td>
      <td>nature_of_loan_settled_1_36</td> 
</tr> 
      <tr>
    <td>nature_of_loan_settled_2</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td></td>
      <td>nature_of_loan_settled_2_56</td> 
</tr> 
      <tr>
    <td>total_emi_bounces</td>
    <td>integer</td>
    <td></td>
    <td>false</td>
    <td></td>
      <td>222</td> 
</tr> 
      <tr>
    <td>emi_bounces_6months</td>
    <td>integer</td>
    <td></td>
    <td>false</td>
    <td>EMI Bounces in the Last 6 Months</td>
      <td>831</td> 
</tr> 
      <tr>
    <td>emi_bounces_12months</td>
    <td>integer</td>
    <td></td>
    <td>false</td>
    <td>EMI Bounces in the Last 12 Months</td>
      <td>728</td> 
</tr> 
      <tr>
    <td>bank_statement_savings_account_12_months_link</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td>Savings Bank Account Statement for the Last 12 Months</td>
      <td>[&quot;bank_statement_savings_account_12_months_link_21&quot;, &quot;bank_statement_savings_account_12_months_link_97&quot;]</td> 
</tr> 
      <tr>
    <td>bank_statement_current_account_12_months_link</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td>Current Account Bank Account Statement for the Last 12 Months</td>
      <td>[&quot;bank_statement_current_account_12_months_link_10&quot;, &quot;bank_statement_current_account_12_months_link_90&quot;]</td> 
</tr> 
      <tr>
    <td>no_of_inward_chq_returns_savings_account</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td></td>
      <td>[802, 951]</td> 
</tr> 
      <tr>
    <td>no_of_outward_chq_returns_savings_account</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td></td>
      <td>[64, 995]</td> 
</tr> 
      <tr>
    <td>no_of_inward_chq_returns_current_account</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td></td>
      <td>[640, 745]</td> 
</tr> 
      <tr>
    <td>no_of_outward_chq_returns_current_account</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td></td>
      <td>[884, 908]</td> 
</tr> 
      <tr>
    <td>bank_account_type_for_assessment</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>Savings / Current / Overdraft / CC</td>
      <td>bank_account_type_for_assessment_38</td> 
</tr> 
      <tr>
    <td>perfios_link</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td>JSON of Perfios/Finbit</td>
      <td>[&quot;perfios_link_13&quot;, &quot;perfios_link_35&quot;]</td> 
</tr> 
      <tr>
    <td>abb</td>
    <td>number</td>
    <td>float</td>
    <td>false</td>
    <td>Average Bank Balance maintaiend on the EMI dates (Calculated by the Originator for the Last 12 Months)</td>
      <td>7.08868369666879</td> 
</tr> 
      <tr>
    <td>abd</td>
    <td>number</td>
    <td>float</td>
    <td>false</td>
    <td>Average Monthly Bank Deposits for the Last 12 Months</td>
      <td>6.619750204289035</td> 
</tr> 
      <tr>
    <td>annual_business_turnover</td>
    <td>number</td>
    <td>float</td>
    <td>false</td>
    <td>Annual Business Turnover (in Rupees)</td>
      <td>8.48746274984273</td> 
</tr> 
      <tr>
    <td>annual_gross_profit</td>
    <td>number</td>
    <td>float</td>
    <td>false</td>
    <td>Annual Gross Profit (in Rupees)</td>
      <td>3.5282845684784183</td> 
</tr> 
      <tr>
    <td>annual_business_ebitda</td>
    <td>number</td>
    <td>float</td>
    <td>false</td>
    <td>Annual Business EBITDA (in Rupees)</td>
      <td>5.70759204932318</td> 
</tr> 
      <tr>
    <td>annual_net_income</td>
    <td>number</td>
    <td>float</td>
    <td>false</td>
    <td>Annual Net Income (in Rupees)</td>
      <td>3.2278916054470033</td> 
</tr> 
      <tr>
    <td>monthly_net_profit</td>
    <td>number</td>
    <td>float</td>
    <td>false</td>
    <td>Monthly Net Profit (in Rupees)</td>
      <td>2.63960278752009</td> 
</tr> 
      <tr>
    <td>annual_net_profit</td>
    <td>number</td>
    <td>float</td>
    <td>false</td>
    <td>Annual Net Profit (in Rupees)</td>
      <td>8.25088019358928</td> 
</tr> 
      <tr>
    <td>gst_return_year_1_link</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td>GST Return Document for the Last Year</td>
      <td>[&quot;gst_return_year_1_link_61&quot;, &quot;gst_return_year_1_link_89&quot;]</td> 
</tr> 
      <tr>
    <td>gst_return_year_2_link</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td>GST Return Document for the Last Year - 1</td>
      <td>[&quot;gst_return_year_2_link_87&quot;, &quot;gst_return_year_2_link_28&quot;]</td> 
</tr> 
      <tr>
    <td>gst_return_year_3_link</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td>GST Return Document for the Last Year - 2</td>
      <td>[&quot;gst_return_year_3_link_87&quot;, &quot;gst_return_year_3_link_27&quot;]</td> 
</tr> 
      <tr>
    <td>it_return_year_1_link</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td>IT Return Document for the Last Year</td>
      <td>[&quot;it_return_year_1_link_72&quot;, &quot;it_return_year_1_link_25&quot;]</td> 
</tr> 
      <tr>
    <td>it_return_year_2_link</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td>IT Return Document for the Last Year - 1</td>
      <td>[&quot;it_return_year_2_link_83&quot;, &quot;it_return_year_2_link_38&quot;]</td> 
</tr> 
      <tr>
    <td>it_return_year_3_link</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td>IT Return Document for the Last Year - 2</td>
      <td>[&quot;it_return_year_3_link_48&quot;, &quot;it_return_year_3_link_29&quot;]</td> 
</tr> 
      <tr>
    <td>other_income_assessment_proof_link</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td>Kachcha/Pucca Bill Copies</td>
      <td>[&quot;other_income_assessment_proof_link_49&quot;, &quot;other_income_assessment_proof_link_33&quot;]</td> 
</tr> 
      <tr>
    <td>cam_link</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td>CAM Document Link</td>
      <td>[&quot;cam_link_56&quot;, &quot;cam_link_96&quot;]</td> 
</tr> 
      <tr>
    <td>cfa_link</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td>CFA Document Link</td>
      <td>[&quot;cfa_link_32&quot;, &quot;cfa_link_29&quot;]</td> 
</tr> 
      <tr>
    <td>abb_emi_ratio</td>
    <td>number</td>
    <td>float</td>
    <td>false</td>
    <td></td>
      <td>3.393834559378286</td> 
</tr> 
      <tr>
    <td>dscr</td>
    <td>number</td>
    <td>float</td>
    <td>false</td>
    <td>Debt Service Coverage Ratio</td>
      <td>7.467900230831925</td> 
</tr> 
      <tr>
    <td>foir</td>
    <td>number</td>
    <td>float</td>
    <td>false</td>
    <td>Fixed Obligations to Income Ratio</td>
      <td>3.715947285518811</td> 
</tr> 
      <tr>
    <td>ltr</td>
    <td>number</td>
    <td>float</td>
    <td>false</td>
    <td>Loan Transfer Ratio</td>
      <td>7.305956605637732</td> 
</tr> 
      <tr>
    <td>eligibility_loan_amount</td>
    <td>number</td>
    <td>float</td>
    <td>false</td>
    <td></td>
      <td>5.128092635738042</td> 
</tr> 
      <tr>
    <td>credit_insurance_insurer</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>Insurer Name (If Credit Shield Insurance is taken)</td>
      <td>credit_insurance_insurer_84</td> 
</tr> 
      <tr>
    <td>credit_insurance_nominee_details</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>Name of the Nominee (If Credit Shield Insurance is taken)</td>
      <td>credit_insurance_nominee_details_70</td> 
</tr> 
      <tr>
    <td>credit_insurance_relationship</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>Relationship of the Nominee (If Credit Shield Insurance is taken)</td>
      <td>credit_insurance_relationship_34</td> 
</tr> 
      <tr>
    <td>credit_insurance_premium</td>
    <td>number</td>
    <td>float</td>
    <td>false</td>
    <td>Premium Amount (If Credit Shield Insurance is taken)</td>
      <td>0.33692173129690195</td> 
</tr> 
      <tr>
    <td>credit_insurance_amount</td>
    <td>number</td>
    <td>float</td>
    <td>false</td>
    <td>Total Insurance Amount (If Credit Shield Insurance is taken)</td>
      <td>4.805442983096883</td> 
</tr> 
      <tr>
    <td>credit_insurance_policy_number</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>Policy Number (If Credit Shield Insurance is taken)</td>
      <td>credit_insurance_policy_number_98</td> 
</tr> 
      <tr>
    <td>asset_insurance_insurer</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>Insurer Name</td>
      <td>asset_insurance_insurer_11</td> 
</tr> 
      <tr>
    <td>asset_insurance_nominee_details</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td>Name of the Nominee</td>
      <td>asset_insurance_nominee_details_64</td> 
</tr> 
      <tr>
    <td>asset_insurance_premium</td>
    <td>number</td>
    <td>float</td>
    <td>false</td>
    <td>Premium Amount (in Rupees)</td>
      <td>9.599245346793362</td> 
</tr> 
      <tr>
    <td>asset_insurance_amount</td>
    <td>number</td>
    <td>float</td>
    <td>false</td>
    <td>Total Insurance Amount (in Rupees)</td>
      <td>0.45084683726222985</td> 
</tr> 
      <tr>
    <td>asset_insurance_policy_number</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td></td>
      <td>asset_insurance_policy_number_57</td> 
</tr> 
      <tr>
    <td>psl_flag</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td></td>
      <td>psl_flag_28</td> 
</tr> 
      <tr>
    <td>psl_description</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td></td>
      <td>psl_description_21</td> 
</tr> 
      <tr>
    <td>psl_code</td>
    <td>string</td>
    <td></td>
    <td>false</td>
    <td></td>
      <td>psl_code_19</td> 
</tr> 
      <tr>
    <td>psl_proof_link</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td></td>
      <td>[&quot;psl_proof_link_67&quot;, &quot;psl_proof_link_11&quot;]</td> 
</tr> 
      <tr>
    <td>loan_agreement_link</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td></td>
      <td>[&quot;loan_agreement_link_18&quot;, &quot;loan_agreement_link_28&quot;]</td> 
</tr> 
      <tr>
    <td>sanction_letter_link</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td></td>
      <td>[&quot;sanction_letter_link_35&quot;, &quot;sanction_letter_link_16&quot;]</td> 
</tr> 
      <tr>
    <td>laf_link</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td></td>
      <td>[&quot;laf_link_27&quot;, &quot;laf_link_41&quot;]</td> 
</tr> 
      <tr>
    <td>self_declaration_letter_link</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td></td>
      <td>[&quot;self_declaration_letter_link_75&quot;, &quot;self_declaration_letter_link_57&quot;]</td> 
</tr> 
      <tr>
    <td>authorisation_letter_link</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td></td>
      <td>[&quot;authorisation_letter_link_44&quot;, &quot;authorisation_letter_link_87&quot;]</td> 
</tr> 
      <tr>
    <td>enach_pdc_link</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td></td>
      <td>[&quot;enach_pdc_link_39&quot;, &quot;enach_pdc_link_27&quot;]</td> 
</tr> 
      <tr>
    <td>guarantor_agreements_link</td>
    <td>array</td>
    <td></td>
    <td>false</td>
    <td></td>
      <td>[&quot;guarantor_agreements_link_82&quot;, &quot;guarantor_agreements_link_55&quot;]</td> 
</tr> 
  </tbody>
      </table>
## Response Codes

<table border="2" cellspacing="0" cellpadding="6" rules="groups" frame="hsides">
  <thead>
    <tr>
      <th scope="col" class="org-right">Code</th>
      <th scope="col" class="org-left">Message</th>
      <th scope="col" class="org-left">Reason</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td class="org-right">204</td>
      <td class="org-left">No content</td>
      <td class="org-left">Success</td>
    </tr>
    <tr>
      <td class="org-right">401</td>
      <td class="org-left">Unauthorized</td>
      <td class="org-left">Invalid API Key</td>
    </tr>
    <tr>
      <td class="org-right">400</td>
      <td class="org-left">Bad Request</td>
      <td class="org-left"><ul><li>Failed due to invalid request format</li>
          <li>Missing required parameters</li>
          <li>Loan is in invalid state</li>
      </td>
    </tr>
    <tr>
      <td class="org-right">404</td>
      <td class="org-left">Not found</td>
      <td class="org-left">Loan not found</td>
    </tr>
    <tr>
      <td class="org-right">500</td>
      <td class="org-left">Internal Server Error</td>
      <td class="org-left">Error occurred in the backend</td>
    </tr>
  </tbody>
</table>


```java
CompletableFuture<AgreementSigned200> updatePostDisbursementAsync(
    final String clientName,
    final String loanId,
    final ClientsApiLoansUpdatePostDisbursementRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `clientName` | `String` | Template, Required | Name of the client |
| `loanId` | `String` | Template, Required | Client Loan ID as provided during loan creation |
| `body` | [`ClientsApiLoansUpdatePostDisbursementRequest`](/doc/models/clients-api-loans-update-post-disbursement-request.md) | Body, Required | - |

## Response Type

[`AgreementSigned200`](/doc/models/agreement-signed-200.md)

## Example Usage

```java
String clientName = "krazybee";
String loanId = "AB001";
ClientsApiLoansUpdatePostDisbursementRequest body = new ClientsApiLoansUpdatePostDisbursementRequest();
body.setCustomerType("customer_type_30");
body.setCustomerCategory("customer_category_10");
body.setFirstName("first_name_65");
body.setMiddleName("middle_name_82");
body.setLastName("last_name_66");
body.setGender("gender_14");
body.setDateOfBirth(LocalDate.parse("2020-12-25"));
body.setAge(803);
body.setMobileNumber("mobile_number_25");
body.setPersonalEmailId("personal_email_id_75");
body.setOfficialEmailId("official_email_id_49");
body.setCurrentAddress("current_address_49");
body.setCurrentCity("current_city_32");
body.setCurrentDistrict("current_district_72");
body.setCurrentState("current_state_54");
body.setCurrentPincode(345);
body.setResidenceTypeCurrentAddress("residence_type_current_address_49");
body.setYearsOfStayInCurrentAddress(447);
body.setPermanentAddress("permanent_address_69");
body.setPermanentCity("permanent_city_15");
body.setPermanentDistrict("permanent_district_12");
body.setPermanentState("permanent_state_60");
body.setPermanentPincode(180);
body.setResidenceTypePermanentAddress("residence_type_permanent_address_82");
body.setYearsOfStayInPermanentAddress(170);
body.setMaritalStatus("marital_status_85");
body.setReligion("religion_80");
body.setNationality("nationality_70");
body.setFatherName("father_name_96");
body.setMotherName("mother_name_89");
body.setSpouseName("spouse_name_75");
body.setEducationQualification("education_qualification_85");
body.setNetMonthlyIncome(7.877011107426441);
body.setAnnualIncome(9.421437195881696);
body.setNumberOfDependants(482);
body.setOccupation("occupation_85");
body.setPanNumber("pan_number_16");
body.setPanLink(new LinkedList<>());
body.getPanLink().add("pan_link_89");
body.getPanLink().add("pan_link_99");
body.setForm60Link(new LinkedList<>());
body.getForm60Link().add("form_60_link_92");
body.getForm60Link().add("form_60_link_69");
body.setAadharNumber("aadhar_number_61");
body.setAadharLink(new LinkedList<>());
body.getAadharLink().add("aadhar_link_46");
body.getAadharLink().add("aadhar_link_81");
body.setVoterIdNumber("voter_id_number_72");
body.setVotingIdLink(new LinkedList<>());
body.getVotingIdLink().add("voting_id_link_55");
body.getVotingIdLink().add("voting_id_link_88");
body.setDrivingLicenseNumber("driving_license_number_50");
body.setDrivingLicenseLink(new LinkedList<>());
body.getDrivingLicenseLink().add("driving_license_link_30");
body.getDrivingLicenseLink().add("driving_license_link_21");
body.setPassportNumber("passport_number_78");
body.setPassportLink(new LinkedList<>());
body.getPassportLink().add("passport_link_48");
body.getPassportLink().add("passport_link_94");
body.setVideoKycLink(new LinkedList<>());
body.getVideoKycLink().add("video_kyc_link_13");
body.getVideoKycLink().add("video_kyc_link_60");
body.setVideoKycProfileId("video_kyc_profile_id_20");
body.setVideoKycAccountId("video_kyc_account_id_87");
body.setVideoKycKey("video_kyc_key_16");
body.setOtherKycNumber("other_kyc_number_77");
body.setOtherKycLink(new LinkedList<>());
body.getOtherKycLink().add("other_kyc_link_70");
body.getOtherKycLink().add("other_kyc_link_18");
body.setRentAgreementLink(new LinkedList<>());
body.getRentAgreementLink().add("rent_agreement_link_90");
body.getRentAgreementLink().add("rent_agreement_link_27");
body.setUtilityBillsLink(new LinkedList<>());
body.getUtilityBillsLink().add("utility_bills_link_14");
body.getUtilityBillsLink().add("utility_bills_link_22");
body.setPhotoLink(new LinkedList<>());
body.getPhotoLink().add("photo_link_21");
body.getPhotoLink().add("photo_link_78");
body.setEmploymentType("employment_type_24");
body.setEmploymentDetailsName("employment_details_name_40");
body.setEmploymentDetailsAddress("employment_details_address_18");
body.setEmploymentDetailsYearsOfExperience(5.4280555177273335);
body.setEmploymentDetailsDesignation("employment_details_designation_61");
body.setPayslipLink(new LinkedList<>());
body.getPayslipLink().add("payslip_link_94");
body.getPayslipLink().add("payslip_link_72");
body.setTdsCertificateLink(new LinkedList<>());
body.getTdsCertificateLink().add("tds_certificate_link_98");
body.getTdsCertificateLink().add("tds_certificate_link_46");
body.setNameOfBureau("name_of_bureau_33");
body.setBureauVintage(541);
body.setBureauScore(783);
body.setBureauReportLink(new LinkedList<>());
body.getBureauReportLink().add("bureau_report_link_27");
body.getBureauReportLink().add("bureau_report_link_85");
body.setCommercialBureauScore(942);
body.setCommercialBureauScoreLink(new LinkedList<>());
body.getCommercialBureauScoreLink().add("commercial_bureau_score_link_82");
body.getCommercialBureauScoreLink().add("commercial_bureau_score_link_72");
body.setPartnerScoreOnTheCustomer(938);
body.setTotalExistingObligations(74);
body.setCreditCardLimit(880);
body.setNumberOfCreditCards(151);
body.setNumberOfUnsecuredLoans(487);
body.setValueOfTotalUnsecuredLoans(6.993667539564163);
body.setNumberOfLoans(847);
body.setValueOfTotalLoans(4.831926611585921);
body.setNumberOfEnquiries3months(334);
body.setNumberOfEnquiries6months(541);
body.setNumberOfEnquiries12months(513);
body.setNumberOfWriteoffSuitfiledSettled12months(485);
body.setMaxDpdTradeline12months(1000);
body.setMaxOverdueTradeline(212);
body.setTotalOverdueAmount12months(8.614892533716507);
body.setLoanAmountSettled12months(3.0829691356942246);
body.setNatureOfLoanSettled1("nature_of_loan_settled_1_36");
body.setNatureOfLoanSettled2("nature_of_loan_settled_2_56");
body.setTotalEmiBounces(222);
body.setEmiBounces6months(831);
body.setEmiBounces12months(728);
body.setBankStatementSavingsAccount12MonthsLink(new LinkedList<>());
body.getBankStatementSavingsAccount12MonthsLink().add("bank_statement_savings_account_12_months_link_21");
body.getBankStatementSavingsAccount12MonthsLink().add("bank_statement_savings_account_12_months_link_97");
body.setBankStatementCurrentAccount12MonthsLink(new LinkedList<>());
body.getBankStatementCurrentAccount12MonthsLink().add("bank_statement_current_account_12_months_link_10");
body.getBankStatementCurrentAccount12MonthsLink().add("bank_statement_current_account_12_months_link_90");
body.setNoOfInwardChqReturnsSavingsAccount(new LinkedList<>());
body.getNoOfInwardChqReturnsSavingsAccount().add(802);
body.getNoOfInwardChqReturnsSavingsAccount().add(951);
body.setNoOfOutwardChqReturnsSavingsAccount(new LinkedList<>());
body.getNoOfOutwardChqReturnsSavingsAccount().add(64);
body.getNoOfOutwardChqReturnsSavingsAccount().add(995);
body.setNoOfInwardChqReturnsCurrentAccount(new LinkedList<>());
body.getNoOfInwardChqReturnsCurrentAccount().add(640);
body.getNoOfInwardChqReturnsCurrentAccount().add(745);
body.setNoOfOutwardChqReturnsCurrentAccount(new LinkedList<>());
body.getNoOfOutwardChqReturnsCurrentAccount().add(884);
body.getNoOfOutwardChqReturnsCurrentAccount().add(908);
body.setBankAccountTypeForAssessment("bank_account_type_for_assessment_38");
body.setPerfiosLink(new LinkedList<>());
body.getPerfiosLink().add("perfios_link_13");
body.getPerfiosLink().add("perfios_link_35");
body.setAbb(7.08868369666879);
body.setAbd(6.619750204289035);
body.setAnnualBusinessTurnover(8.48746274984273);
body.setAnnualGrossProfit(3.5282845684784183);
body.setAnnualBusinessEbitda(5.70759204932318);
body.setAnnualNetIncome(3.2278916054470033);
body.setMonthlyNetProfit(2.63960278752009);
body.setAnnualNetProfit(8.25088019358928);
body.setGstReturnYear1Link(new LinkedList<>());
body.getGstReturnYear1Link().add("gst_return_year_1_link_61");
body.getGstReturnYear1Link().add("gst_return_year_1_link_89");
body.setGstReturnYear2Link(new LinkedList<>());
body.getGstReturnYear2Link().add("gst_return_year_2_link_87");
body.getGstReturnYear2Link().add("gst_return_year_2_link_28");
body.setGstReturnYear3Link(new LinkedList<>());
body.getGstReturnYear3Link().add("gst_return_year_3_link_87");
body.getGstReturnYear3Link().add("gst_return_year_3_link_27");
body.setItReturnYear1Link(new LinkedList<>());
body.getItReturnYear1Link().add("it_return_year_1_link_72");
body.getItReturnYear1Link().add("it_return_year_1_link_25");
body.setItReturnYear2Link(new LinkedList<>());
body.getItReturnYear2Link().add("it_return_year_2_link_83");
body.getItReturnYear2Link().add("it_return_year_2_link_38");
body.setItReturnYear3Link(new LinkedList<>());
body.getItReturnYear3Link().add("it_return_year_3_link_48");
body.getItReturnYear3Link().add("it_return_year_3_link_29");
body.setOtherIncomeAssessmentProofLink(new LinkedList<>());
body.getOtherIncomeAssessmentProofLink().add("other_income_assessment_proof_link_49");
body.getOtherIncomeAssessmentProofLink().add("other_income_assessment_proof_link_33");
body.setCamLink(new LinkedList<>());
body.getCamLink().add("cam_link_56");
body.getCamLink().add("cam_link_96");
body.setCfaLink(new LinkedList<>());
body.getCfaLink().add("cfa_link_32");
body.getCfaLink().add("cfa_link_29");
body.setAbbEmiRatio(3.393834559378286);
body.setDscr(7.467900230831925);
body.setFoir(3.715947285518811);
body.setLtr(7.305956605637732);
body.setEligibilityLoanAmount(5.128092635738042);
body.setCreditInsuranceInsurer("credit_insurance_insurer_84");
body.setCreditInsuranceNomineeDetails("credit_insurance_nominee_details_70");
body.setCreditInsuranceRelationship("credit_insurance_relationship_34");
body.setCreditInsurancePremium(0.33692173129690195);
body.setCreditInsuranceAmount(4.805442983096883);
body.setCreditInsurancePolicyNumber("credit_insurance_policy_number_98");
body.setAssetInsuranceInsurer("asset_insurance_insurer_11");
body.setAssetInsuranceNomineeDetails("asset_insurance_nominee_details_64");
body.setAssetInsurancePremium(9.599245346793362);
body.setAssetInsuranceAmount(0.45084683726222985);
body.setAssetInsurancePolicyNumber("asset_insurance_policy_number_57");
body.setPslFlag("psl_flag_28");
body.setPslDescription("psl_description_21");
body.setPslCode("psl_code_19");
body.setPslProofLink(new LinkedList<>());
body.getPslProofLink().add("psl_proof_link_67");
body.getPslProofLink().add("psl_proof_link_11");
body.setLoanAgreementLink(new LinkedList<>());
body.getLoanAgreementLink().add("loan_agreement_link_18");
body.getLoanAgreementLink().add("loan_agreement_link_28");
body.setSanctionLetterLink(new LinkedList<>());
body.getSanctionLetterLink().add("sanction_letter_link_35");
body.getSanctionLetterLink().add("sanction_letter_link_16");
body.setLafLink(new LinkedList<>());
body.getLafLink().add("laf_link_27");
body.getLafLink().add("laf_link_41");
body.setSelfDeclarationLetterLink(new LinkedList<>());
body.getSelfDeclarationLetterLink().add("self_declaration_letter_link_75");
body.getSelfDeclarationLetterLink().add("self_declaration_letter_link_57");
body.setAuthorisationLetterLink(new LinkedList<>());
body.getAuthorisationLetterLink().add("authorisation_letter_link_44");
body.getAuthorisationLetterLink().add("authorisation_letter_link_87");
body.setEnachPdcLink(new LinkedList<>());
body.getEnachPdcLink().add("enach_pdc_link_39");
body.getEnachPdcLink().add("enach_pdc_link_27");
body.setGuarantorAgreementsLink(new LinkedList<>());
body.getGuarantorAgreementsLink().add("guarantor_agreements_link_82");
body.getGuarantorAgreementsLink().add("guarantor_agreements_link_55");

aPIController.updatePostDisbursementAsync(clientName, loanId, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "client_loan_id": "AB001",
  "status": "agreement_signed"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad Request | [`BadRequestException`](/doc/models/bad-request-exception.md) |
| 401 | Unauthorized | [`UnauthorizedException`](/doc/models/unauthorized-exception.md) |
| 404 | Not Found | [`NotFoundException`](/doc/models/not-found-exception.md) |
| 500 | Internal Server Error | [`InternalServerErrorException`](/doc/models/internal-server-error-exception.md) |

