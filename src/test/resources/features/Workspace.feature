@clockify
Feature: Workspace

  @getWorkspaces
  Scenario Outline: Get all my workspaces
    Given the user of clockify has an api-key <x-api-key>
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then status code <statusCode> is obtained
    And get workspaceId


    Examples:
      | jsonName     | statusCode | operation | entity    | x-api-key                                        |
      | getWorkspace | 200        | GET       | WORKSPACE | MmY4ZmVjOGItMDEwMS00YjEzLWJiMTUtYWUxZGJiZWExMmJm |

  @failed
  Scenario Outline: Get all my workspaces failed
    Given the user of clockify has an api-key <x-api-key>
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then status code <statusCode> is obtained
    And get message <message>


    Examples:
      | jsonName     | statusCode | operation | entity    | x-api-key                                       | message           |
      | getWorkspace | 401        | GET       | WORKSPACE | MmY4ZmVjOGItMDEwMS00YjEzLWJiMTUtYWUxZGJiZWExMmJ | incorrect api-key |


