
# Clients Api Loans Advance Payments Request

## Structure

`ClientsApiLoansAdvancePaymentsRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `InstrumentNumber` | `String` | Optional | UTR / Cheque Number | String getInstrumentNumber() | setInstrumentNumber(String instrumentNumber) |
| `InstrumentType` | `String` | Optional | RTGS / NEFT / UPI / Cheque | String getInstrumentType() | setInstrumentType(String instrumentType) |
| `TransactionType` | `String` | Optional | Credit / Refund | String getTransactionType() | setTransactionType(String transactionType) |
| `Amount` | `Double` | Optional | - | Double getAmount() | setAmount(Double amount) |
| `TransactionDate` | `LocalDate` | Optional | Date when customer paid the amount (YYYY-MM-DD) | LocalDate getTransactionDate() | setTransactionDate(LocalDate transactionDate) |
| `InvestorTransferDate` | `LocalDate` | Optional | Date when originator transferred the amount to investor (YYYY-MM-DD) | LocalDate getInvestorTransferDate() | setInvestorTransferDate(LocalDate investorTransferDate) |
| `AdvanceOutstanding` | `Double` | Optional | Before this collection record to mention advance outstanding for that loan | Double getAdvanceOutstanding() | setAdvanceOutstanding(Double advanceOutstanding) |
| `Comment` | `String` | Optional | - | String getComment() | setComment(String comment) |

## Example (as JSON)

```json
{
  "instrument_number": null,
  "instrument_type": null,
  "transaction_type": null,
  "amount": null,
  "transaction_date": null,
  "investor_transfer_date": null,
  "advance_outstanding": null,
  "comment": null
}
```

