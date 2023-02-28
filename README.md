# CIS Homework Assignment
#### Principal Software Engineer
This assignment helps us assess your programming abilities. Your mission, should you choose to accept it, is to complete the assigned tasks below and return your completed files to us within one week. You must work alone and while some questions are allowed, please do try to finish as much as you can on your own (research is of course allowed). Remember this is our only visibility into your coding skills. We take this seriously.

## Setup Tasks
1) Choose to work in Java, PHP, or Perl on the operating system of your choice.
2) If possible, please maintain the majority of your code and work on this assignment on a GitHub account (new one or existing one) and share with us at the end of the assignment.

## Coding Tasks
Feel free to construct your code however you like, creating classes/helper methods/etc. where appropriate.
1) Construct a main.* file, from which you’ll be reading in data and calling various methods to answer some coding questions.
2) Read in the given CSV file animals.csv as it contains the input you’ll need for the assignment.  Store the data in the way you find most organized and efficient.  (Note:  you do not need to set up a database for this, but if you’re so inclined, you’re more than welcome to!)
3) Create a method to add an animal/owner combination, if you have not already done so.

Now that the data is in, it’s time to answer a few questions.  Please write methods that are called from your main method (or some equivalent) so that these answers can be printed to the console (or a file, or…)

1) You may have noticed that some of the animal names are palindromes.  Please list them in any order.
2) List the average age of the animals owned by each person, alphabetically by the person’s name.
3) List the animals by age.  I.e., list all the animals with age 1, then age 2, etc.

## Testing Tasks
1) Create unit tests to verify that the create animal/owner combo method works as planned.
2) Create unit tests to verify that animals cannot be added if their age is negative.
3) Create any other unit tests you deem appropriate.

## Data Tasks
Again, it is not required that you set up a database connection for this assignment but please answer the following questions with generic SQL statements.
1) Query the total number of animals
```sql
select count(*) from animals
```
2) Query the total number of owners
```sql
select distinct owner from animals
```
3) Query the number of Turtles
```sql
select count(*) 
from animals
where species == "turtle"
```
4) List all Cats, in order of ascending age
```sql
select *
from animals
where species == "cat"
order by age asc;
```

## Theory Questions
1) Suppose we needed to add some extra fields to the animals depending on the species.  How might one go about this?
2) How would you go about handling animals or people with the same name?
3) How would you approach this type of task working on a team of people?
4) Data integrity is very important in a production environment.  What things can you do to ensure integrity?
5) Assume that this program becomes a web application accessible to anyone.  How might it be improved to handle the additional load it faces?



