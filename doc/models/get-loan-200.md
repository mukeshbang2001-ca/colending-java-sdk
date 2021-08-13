
# Get Loan 200

## Structure

`GetLoan200`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ClientLoanId` | `String` | Optional | Unique identifier for the loan | String getClientLoanId() | setClientLoanId(String clientLoanId) |
| `ProductId` | `Integer` | Optional | Product ID | Integer getProductId() | setProductId(Integer productId) |
| `PrincipalAmount` | `Double` | Optional | Principal amount for the loan | Double getPrincipalAmount() | setPrincipalAmount(Double principalAmount) |
| `InterestRate` | `Double` | Optional | Interest rate in percentage | Double getInterestRate() | setInterestRate(Double interestRate) |
| `Tenure` | `Integer` | Optional | Tenure of the loan | Integer getTenure() | setTenure(Integer tenure) |
| `TenureFrequency` | `String` | Optional | Tenure Frequency | String getTenureFrequency() | setTenureFrequency(String tenureFrequency) |
| `NoOfRepayments` | `Integer` | Optional | Number of Repayments | Integer getNoOfRepayments() | setNoOfRepayments(Integer noOfRepayments) |
| `Status` | `String` | Optional | Current status of the loan | String getStatus() | setStatus(String status) |
| `PrincipalOutstanding` | `Double` | Optional | current POS of the loan | Double getPrincipalOutstanding() | setPrincipalOutstanding(Double principalOutstanding) |
| `RejectReason` | `String` | Optional | Reason for rejecting loan | String getRejectReason() | setRejectReason(String rejectReason) |
| `Applicants` | [`List<Applicant>`](/doc/models/applicant.md) | Optional | Array of applicant details | List<Applicant> getApplicants() | setApplicants(List<Applicant> applicants) |

## Example (as JSON)

```json
{
  "client_loan_id": null,
  "product_id": null,
  "principal_amount": null,
  "interest_rate": null,
  "tenure": null,
  "tenure_frequency": null,
  "no_of_repayments": null,
  "status": null,
  "principal_outstanding": null,
  "reject_reason": null,
  "applicants": null
}
```

