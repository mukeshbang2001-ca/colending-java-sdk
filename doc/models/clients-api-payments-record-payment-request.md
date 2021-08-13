
# Clients Api Payments Record Payment Request

## Structure

`ClientsApiPaymentsRecordPaymentRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `InstallmentNo` | `Integer` | Optional | - | Integer getInstallmentNo() | setInstallmentNo(Integer installmentNo) |
| `DueDate` | `LocalDate` | Optional | - | LocalDate getDueDate() | setDueDate(LocalDate dueDate) |
| `Principal` | `Double` | Optional | Total principal amount paid for this installment | Double getPrincipal() | setPrincipal(Double principal) |
| `Interest` | `Double` | Optional | Total interest amount paid for this installement | Double getInterest() | setInterest(Double interest) |
| `OtherCharges` | `Double` | Optional | - | Double getOtherCharges() | setOtherCharges(Double otherCharges) |
| `OverdueCharges` | `Double` | Optional | - | Double getOverdueCharges() | setOverdueCharges(Double overdueCharges) |
| `PenaltyCharges` | `Double` | Optional | - | Double getPenaltyCharges() | setPenaltyCharges(Double penaltyCharges) |
| `FeeCharges` | `Double` | Optional | - | Double getFeeCharges() | setFeeCharges(Double feeCharges) |
| `BounceCharges` | `Double` | Optional | - | Double getBounceCharges() | setBounceCharges(Double bounceCharges) |
| `Amount` | `Double` | Optional | Total Collection Amount | Double getAmount() | setAmount(Double amount) |
| `PaymentType` | `String` | Optional | Normal / Part / Advance | String getPaymentType() | setPaymentType(String paymentType) |
| `ReferenceNo` | `String` | Optional | UTR / Cheque Number | String getReferenceNo() | setReferenceNo(String referenceNo) |
| `PaidDate` | `LocalDate` | Optional | Date when customer paid the amount (YYYY-MM-DD) | LocalDate getPaidDate() | setPaidDate(LocalDate paidDate) |
| `InvestorTransferDate` | `LocalDate` | Optional | Date when originator transferred the amount to investor (YYYY-MM-DD) | LocalDate getInvestorTransferDate() | setInvestorTransferDate(LocalDate investorTransferDate) |
| `EmiClosed` | `Boolean` | Optional | Y / N | Boolean getEmiClosed() | setEmiClosed(Boolean emiClosed) |
| `Foreclosure` | `Boolean` | Optional | Y / N | Boolean getForeclosure() | setForeclosure(Boolean foreclosure) |
| `Pos` | `Double` | Optional | Before the collection record to mention pos for that loan | Double getPos() | setPos(Double pos) |
| `AdvanceKnockOff` | `Boolean` | Optional | Y / N (Required if advance payment is made) | Boolean getAdvanceKnockOff() | setAdvanceKnockOff(Boolean advanceKnockOff) |
| `AdvanceOutstanding` | `Double` | Optional | Before the collection record to mention advance outstanding for that loan | Double getAdvanceOutstanding() | setAdvanceOutstanding(Double advanceOutstanding) |
| `UpdatedRs` | [`List<UpdatedR>`](/doc/models/updated-r.md) | Optional | Required when prepayment is made | List<UpdatedR> getUpdatedRs() | setUpdatedRs(List<UpdatedR> updatedRs) |

## Example (as JSON)

```json
{
  "installment_no": null,
  "due_date": null,
  "principal": null,
  "interest": null,
  "other_charges": null,
  "overdue_charges": null,
  "penalty_charges": null,
  "fee_charges": null,
  "bounce_charges": null,
  "amount": null,
  "payment_type": null,
  "reference_no": null,
  "paid_date": null,
  "investor_transfer_date": null,
  "emi_closed": null,
  "foreclosure": null,
  "pos": null,
  "advance_knock_off": null,
  "advance_outstanding": null,
  "updated_rs": null
}
```

