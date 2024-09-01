Feature : Login Functionality 
Background : 
Given the user is on login Page

Scenario : Successfull login
When the user enters valid credentials 
Then the should be redirects to the Dashboard

Scenario : Invalid Login
When the user enters invalid Login
Then an error Messgae should display
And the user should remain on the login Page

Scenario Outline :eating
Given There are <start> cucumber
When i eat <eat> cucumber 
Then i should have <left> cucumber 

Examples : 
|start| eat | left |
| 12  | 5   | 7    |
| 20  | 5   | 15   |


Types of Hooks-
● @Before: Runs before each scenario.
● @After: Runs after each scenario.
● @BeforeStep: Runs before each step.
● @AfterStep: Runs after each step.

@Before
public void beforeScenario() {
// code to execute before each scenario
}
@After
public void afterScenario() {
    // code to execute after each scenario
}

Paramaterization 

Cucumber allows for parameterization within steps to handle dynamic data.
Syntax: Parameters are denoted by {} within steps.

Gherkin Example:
Given the user has logged in with "{username}" and "{password}"

Step Definition Example:

@Given ("the user has logged in with {String} and {String}")
public void userLogin(String username, String Password){
// code to handle login with provided username and password
} 
