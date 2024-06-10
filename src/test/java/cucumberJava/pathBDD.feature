Feature: Test the path result
  Scenario: one path exit
    Given I have a path
    When start to find the shortest path
    Then the shortest path is 8