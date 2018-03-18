Feature: Google Searching
  As a web surfer,
  I want to search Google,
  So that I can learn new things.

  @web @google @panda @automated
  Scenario: Simple Google search
    Given a web browser is on the Google page
    When the search phrase "panda" is entered
    Then results for "panda" are shown

