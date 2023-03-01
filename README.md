# Smart Academy Practice
# Project for https://officemart.ge web page: The project consists of 40 test cases
# Start the Test
The following programs are used to start testing:IntelliJ IDEA, Java ,Selenide, TestNG, Maven
# Clone this repository:https://github.com/teokevlishvili/Officemart
# Test cases are divided into three steps:
1. Search steps:The test case is about how to access the search button and how to search for products on the site:for example
2. @Test(priority = 1)
   @Description("Test Case N2,search correct item")
   public void Test2() {
   SearchSteps steps = new SearchSteps();
   steps
   .GotoSearchPage()
   .Searchform()
   .SearchCorrectProduct(SearchProduct);
   } 
3. Cart Steps: Test cases are about how to access the cart
4. Company Steps:Test cases are about how to fill the legal field of the company
# Command in the terminal:
1. mvn test
2. allure serve
 

