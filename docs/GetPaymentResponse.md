

# GetPaymentResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clientLoanId** | **String** | Unique identifier for the loan |  [optional]
**productId** | **Integer** | Product ID |  [optional]
**principalAmount** | **Float** | Principal amount for the loan |  [optional]
**interestRate** | **Float** | Interest rate in percentage |  [optional]
**tenure** | **Integer** | Tenure of the loan |  [optional]
**tenureFrequency** | **String** | Tenure Frequency |  [optional]
**noOfRepayments** | **Integer** | Number of Repayments |  [optional]
**status** | **String** | Current status of the loan |  [optional]
**principalOutstanding** | **Float** | current POS of the loan |  [optional]
**rejectReason** | **String** | Reason for rejecting loan |  [optional]
**applicants** | [**List&lt;GetPaymentResponseApplicants&gt;**](GetPaymentResponseApplicants.md) | Array of applicant details |  [optional]



