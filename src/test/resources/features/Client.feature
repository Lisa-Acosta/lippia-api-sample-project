@clockify @client
Feature: Client

  @getClient
  Scenario Outline: find clients on workspace
    Given  the user of clockify has an api-key <x-api-key>
    And I perform a '<operation>' to 'WORKSPACE' endpoint with the 'getWorkspace' and ''
    And status code <statusCode> is obtained
    And get workspaceId
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then status code <statusCode> is obtained

    Examples:
      | jsonName  | statusCode | operation | entity | x-api-key                                        |
      | getClient | 200        | GET       | CLIENT | MmY4ZmVjOGItMDEwMS00YjEzLWJiMTUtYWUxZGJiZWExMmJm |

  @failed
  Scenario Outline: find clients on workspace failed
    Given  the user of clockify has an api-key <x-api-key>
    And I perform a '<operation>' to 'WORKSPACE' endpoint with the 'getWorkspace' and ''
    And status code 200 is obtained
    And get workspaceId
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then status code <statusCode> is obtained
    And get message <message>


    Examples:
      | jsonName           | statusCode | operation | entity | x-api-key                                        | message        |
      | getClientIncorrect | 404        | GET       | CLIENT | MmY4ZmVjOGItMDEwMS00YjEzLWJiMTUtYWUxZGJiZWExMmJm | incorrect json |




