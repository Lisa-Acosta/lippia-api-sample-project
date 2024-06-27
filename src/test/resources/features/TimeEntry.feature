@clockify @timeEntry
Feature: Time Entry

  @getAllEntries
  Scenario Outline: Get time-entries for user on workspace
    Given  the user of clockify has an api-key <x-api-key>
    And I perform a 'GET' to 'WORKSPACE' endpoint with the 'getWorkspace' and ''
    And get workspaceId
    And I perform a 'GET' to 'USER' endpoint with the 'getUsers' and ''
    And get userId
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then status code <statusCode> is obtained
    And get timeEntriesId


    Examples:
      | jsonName       | statusCode | operation | entity  | x-api-key                                        |
      | getTimeEntries | 200        | GET       | ENTRIES | MmY4ZmVjOGItMDEwMS00YjEzLWJiMTUtYWUxZGJiZWExMmJm |


  @addEntry
  Scenario Outline: Add a new time entry
    Given  the user of clockify has an api-key <x-api-key>
    And I perform a 'GET' to 'WORKSPACE' endpoint with the 'getWorkspace' and ''
    And get workspaceId
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then status code <statusCode> is obtained
    And get message


    Examples:
      | jsonName           | statusCode | operation | entity  | x-api-key                                        |
      | addDeleteTimeEntry | 201        | POST      | ENTRIES | MmY4ZmVjOGItMDEwMS00YjEzLWJiMTUtYWUxZGJiZWExMmJm |

  @updateEntry
  Scenario Outline:  update time entry on workspace
    Given  the user of clockify has an api-key <x-api-key>
    And I perform a 'GET' to 'WORKSPACE' endpoint with the 'getWorkspace' and ''
    And get workspaceId
    And I perform a 'POST' to 'ENTRIES' endpoint with the 'addDeleteTimeEntry' and ''
    And status code 201 is obtained
    And get timeEntryId
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then status code <statusCode> is obtained
    And get message


    Examples:
      | jsonName        | statusCode | operation | entity  | x-api-key                                        |
      | updateTimeEntry | 200          | PUT       | ENTRIES | MmY4ZmVjOGItMDEwMS00YjEzLWJiMTUtYWUxZGJiZWExMmJm |


  @deleteEntry
  Scenario Outline: Delete time entry from workspace
    Given  the user of clockify has an api-key <x-api-key>
    And I perform a 'GET' to 'WORKSPACE' endpoint with the 'getWorkspace' and ''
    And get workspaceId
    And I perform a 'POST' to 'ENTRIES' endpoint with the 'addDeleteTimeEntry' and ''
    And get timeEntryId
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then status code <statusCode> is obtained
    And not response at all is obtained


    Examples:
      | jsonName     | statusCode | operation | entity  | x-api-key                                        |
      | getTimeEntry | 204        | DELETE    | ENTRIES | MmY4ZmVjOGItMDEwMS00YjEzLWJiMTUtYWUxZGJiZWExMmJm |

