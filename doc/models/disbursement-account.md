
# Disbursement Account

## Structure

`DisbursementAccount`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountNo` | `String` | Optional | Account number of the bank where disbursement needs to be done | String getAccountNo() | setAccountNo(String accountNo) |
| `IfscCode` | `String` | Optional | Bank IFSC where disbursement needs to be done | String getIfscCode() | setIfscCode(String ifscCode) |
| `AccountType` | `String` | Optional | - | String getAccountType() | setAccountType(String accountType) |
| `AccountName` | `String` | Optional | Bank account name where disbursement needs to be done | String getAccountName() | setAccountName(String accountName) |
| `EntityType` | `String` | Optional | - | String getEntityType() | setEntityType(String entityType) |
| `BankName` | `String` | Optional | Name of the bank where disbursement needs to be done | String getBankName() | setBankName(String bankName) |
| `BankBranchName` | `String` | Optional | - | String getBankBranchName() | setBankBranchName(String bankBranchName) |
| `Amount` | `Double` | Optional | Amount to be transferred to particular Vendor/Borrower | Double getAmount() | setAmount(Double amount) |

## Example (as JSON)

```json
{
  "account_no": null,
  "ifsc_code": null,
  "account_type": null,
  "account_name": null,
  "entity_type": null,
  "bank_name": null,
  "bank_branch_name": null,
  "amount": null
}
```

