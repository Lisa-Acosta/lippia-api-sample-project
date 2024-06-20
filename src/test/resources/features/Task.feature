@clockify @task
Feature: Task

  @addTask
  Scenario Outline: Add new task on workspace
    Given  the user of clockify has an api-key <x-api-key>
    And I perform a 'GET' to 'WORKSPACE' endpoint with the 'getWorkspace' and ''
    And status code 200 is obtained
    And get workspaceId
    And I perform a 'GET' to 'PROJECT' endpoint with the 'getProject' and ''
    And status code 200 is obtained
    And get projectId
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then status code <statusCode> is obtained
    And get message


    Examples:
      | jsonName | statusCode | operation | entity | x-api-key                                        |
      | addTask  | 201        | POST      | TASK   | MmY4ZmVjOGItMDEwMS00YjEzLWJiMTUtYWUxZGJiZWExMmJm |

  @failed
  Scenario Outline: Add new task on workspace failed
    Given  the user of clockify has an api-key <x-api-key>
    And I perform a 'GET' to 'WORKSPACE' endpoint with the 'getWorkspace' and ''
    And status code 200 is obtained
    And get workspaceId
    And I perform a 'GET' to 'PROJECT' endpoint with the 'getProject' and ''
    And status code 200 is obtained
    And get projectId
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then status code <statusCode> is obtained
    And get message


    Examples:
      | jsonName   | statusCode | operation | entity | x-api-key                                        |
      | getProject | 400        | POST      | TASK   | MmY4ZmVjOGItMDEwMS00YjEzLWJiMTUtYWUxZGJiZWExMmJm |
