
# Repayment Schedule

## Structure

`RepaymentSchedule`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `InstallmentNo` | `Integer` | Optional | - | Integer getInstallmentNo() | setInstallmentNo(Integer installmentNo) |
| `DueDate` | `LocalDate` | Optional | - | LocalDate getDueDate() | setDueDate(LocalDate dueDate) |
| `Principal` | `Double` | Optional | - | Double getPrincipal() | setPrincipal(Double principal) |
| `Interest` | `Double` | Optional | - | Double getInterest() | setInterest(Double interest) |
| `Amount` | `Double` | Optional | - | Double getAmount() | setAmount(Double amount) |
| `Pos` | `Double` | Optional | - | Double getPos() | setPos(Double pos) |
| `OtherCharges` | `Double` | Optional | - | Double getOtherCharges() | setOtherCharges(Double otherCharges) |

## Example (as JSON)

```json
{
  "installment_no": null,
  "due_date": null,
  "principal": null,
  "interest": null,
  "amount": null,
  "pos": null,
  "other_charges": null
}
```

