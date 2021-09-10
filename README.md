# discord-sheets-bot

**WIP**

A discord bot that utilizes Google sheets for user role management.

Example spreadsheet:
| Timestamp | Email                    | Clearance? | Today's date | Discord tag |
| --------- | ---------------------    | ---------- | ------------ | ----------- |
| 1/1/2021  | steve.steve@gmail.com    | Yes        | 1/1/2021     | User#0001   |
| 1/2/2021  | alex.alex@gmail.com      | No         | 1/2/2021     | User#0002   |
| 1/3/2021  | dalas.dallas@gmail.com   | Yes        | 1/4/2021     | User#0003   |

(Only Steve would be given access.)
Timestamp must match today's date, and the clearance column must be `Yes`.

Psuedocode:
- Check for provided discord tag in server
  - If not found, check for first/last name combos
    - If there's a match, shade discord tag red for human review
- Else, check clearance and compare date with timestamp
    - If good, then give membership and shade the respective discord tag cell

Planned features:
- DM users who have signed up but haven't been given membership
- Recognize and highlight discord tag changes to first/last name combos
