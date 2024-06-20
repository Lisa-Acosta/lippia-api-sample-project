@clockify @project
Feature: Project

  @getProject
  Scenario Outline: Get projects on workspace
    Given  the user of clockify has an api-key <x-api-key>
    And I perform a 'GET' to 'WORKSPACE' endpoint with the 'getWorkspace' and ''
    And status code <statusCode> is obtained
    And get workspaceId
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then status code <statusCode> is obtained
    And get projectId


    Examples:
      | jsonName   | statusCode | operation | entity  | x-api-key                                        |
      | getProject | 200        | GET       | PROJECT | MmY4ZmVjOGItMDEwMS00YjEzLWJiMTUtYWUxZGJiZWExMmJm |

  @addProject
  Scenario Outline: Add new project on workspace
    Given  the user of clockify has an api-key <x-api-key>
    And I perform a 'GET' to 'WORKSPACE' endpoint with the 'getWorkspace' and ''
    And status code 200 is obtained
    And get workspaceId
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then status code <statusCode> is obtained
    And get message


    Examples:
      | jsonName   | statusCode | operation | entity  | x-api-key                                        |
      | addProject | 201        | POST      | PROJECT | MmY4ZmVjOGItMDEwMS00YjEzLWJiMTUtYWUxZGJiZWExMmJm |

  @failed
  Scenario Outline: Add new project on workspace failed
    Given  the user of clockify has an api-key <x-api-key>
    And I perform a 'GET' to 'WORKSPACE' endpoint with the 'getWorkspace' and ''
    And status code 200 is obtained
    And get workspaceId
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then status code <statusCode> is obtained
    And get message


    Examples:
      | jsonName     | statusCode | operation | entity  | x-api-key                                        |
      | getWorkspace | 400        | POST      | PROJECT | MmY4ZmVjOGItMDEwMS00YjEzLWJiMTUtYWUxZGJiZWExMmJm |

