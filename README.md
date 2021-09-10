# discord-sheets-bot

**WIP**

A discord bot that utilizes Google sheets for user role management.

Color shadings are used to mark which users have been added automatically, which need human review, and which were not found in the server.

Example spreadsheet:
| Timestamp | Email                    | Clearance? | Today's date | Discord tag |
| --------- | ---------------------    | ---------- | ------------ | ----------- |
| 1/1/2021  | steve.steve@gmail.com    | Yes        | 1/1/2021     | User#0001   |
| 1/2/2021  | alex.alex@gmail.com      | No         | 1/2/2021     | User#0002   |
| 1/3/2021  | dalas.dallas@gmail.com   | Yes        | 1/4/2021     | User#0003   |

In this example, only Steve would be given membership.

Requisites for a user to be added automatically:
- `Timestamp` must match `Today's date`
- Clearance column must be `Yes`
- Server nickname must be found in `Email`

Planned features:
- DM users who have signed up but haven't been given membership (marked yellow)
- Recognize and highlight discord tag changes to first/last name combos
