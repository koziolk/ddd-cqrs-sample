Order confirmation

Narrative:
In order to claim copyrights
As a client
I want to finalize my order

Scenario: Finalizing order with available products
Given order exists
When finalize the order
Then order is confirmed
And client has been charged

Scenario: Finalizing order with some products unavailable