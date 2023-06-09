Feature: Test checkout functionality
  Scenario: A user want to buy a product from the store without filling Personal information on chrome browser
    Given : User open Vodafone Shop website and go to shop Page on chrome browser
    When : user select English language
    And : Go to Iphone via “Shop By Brand” section
    And : Select any of returned iphone mobiles
    And : Press add to cart.
    And : Press Proceed to Checkout.
    And : Select “Delivery Options” as “Cairo” “Ain Shams”.
    And : Select “Deliver to My Address”.
    And : Add address details.
    And  : Press continue.
    And : Leave Personal info. Tab empty.
    Then : Show Readable error massage from  “Full Name” field.

  Scenario: A user want to buy a product from the store without filling Personal information on firefox browser
    Given : User open Vodafone Shop website and go to shop Page on firefox browser
    When : user select English language
    And : Go to Iphone via “Shop By Brand” section
    And : Select any of returned iphone mobiles
    And : Press add to cart.
    And : Press Proceed to Checkout.
    And : Select “Delivery Options” as “Cairo” “Ain Shams”.
    And : Select “Deliver to My Address”.
    And : Add address details.
    And  : Press continue.
    And : Leave Personal info. Tab empty.
    Then : Show Readable error massage from  “Full Name” field.






