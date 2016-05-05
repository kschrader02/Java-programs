//Kara Schrader
//CS1 1337.0U1
//This program takes an initialized array and breaks it down into pieces, printing 
//out the persons' last name, street name, and month and year using many methods.

public class StudentReport
{
   public static void main(String[] args)
   {
   
   String arr[] = { "Joe Smith, 101 Pine Street, 10/01/09",
                    "Sue Walls, 506 Maple Street, 04-25-08",
                    "Tim Jones, 909 West Mulberry Avenue, 03/20/10",
                    "Sarah Mills, 1212 North Cedar, 08/10/11",
                    "John K. Clements, 238 Apricot Lane, 06-17-07" };
   
   String[] separate = new String[15];
   String[] address = new String[5];
   String[] names = new String[5];
   String[] date = new String[5];
   String[] lastNames = new String[5];
   String[] street = new String[5];
   String[] newDate = new String[5];
   
   //this for loop splits up the initialized array into pieces and then stores the information in their respective arrays.
   for(int j = 0; j < arr.length; j++)
   {
      separate = arr[j].split(",");
      
      for(int h = 0; h < separate.length; h++)
      {
      
      if(h == 0)
      {
        names[j] = separate[h];
      }
  
       if(h == 1)
       {
          address[j] = separate[h];   
       }
       if(h == 2)
       {  
           date[j] = separate[h];
       }
      } 
   }
   
   lastNames = getLastName(names); //this calls the method getLastName which finds the last name of the person
   street = getStreetName(address);// this calls the method getStreetName which cuts out the street number and gives back the street name
   newDate = getDate(date);// this calls the method getDate which converts the date format given into the written month and year
   
   //this for loop prints out all the data
   for(int s = 0; s < 5; s++)
   {
   System.out.println(lastNames[s] + "," + street[s] + ", " + newDate[s]);
   }
                      
 }//ends the main method
 
 //this method takes the array of names passed through as a parameter and separates out the last name by finding the last space between 
 //letters and using everything after it as the last name and returns this information in the form of an array
 public static String[] getLastName(String[] nameArray)
 {
 
 String[] lastNameArray = new String[5];
 int spaceIndex = 0;
 
 for(int i = 0; i < nameArray.length ; i++)
 {
 spaceIndex = nameArray[i].lastIndexOf(" ");
 
 lastNameArray[i] = nameArray[i].substring(spaceIndex);
 }
 
 return lastNameArray;
 
 }
 
 //This method takes the array of street names that are passed through in the parameters in the form of an array and finds the second 
 //instance of a space and stores all information after this point to a new array. This effectively cuts out the street numbers.
 public static String[] getStreetName( String[] streetAddress)
 {
 
 String[] streetName = new String[5];
 int index = 0;
 
 for(int i = 0; i < streetAddress.length ; i++)
 {
 index = streetAddress[i].indexOf(" " , 2);
 
 streetName[i] = streetAddress[i].substring(index);
 }
 
 return streetName;
 
 } 
 
 //This method takes the array of dates passed through as parameters and turns all slashes into dashes. This then finds the numeric value of 
 //the month and switches through different cases to find out which month it is, and then returns the month and year in an array.
 public static String[] getDate(String[] currentDate)
 {
 
 String[] newDateArray = new String[5];
 int firstIndex = 0;
 int lastIndex = 0;
 String month = "";
 int switchNum = 0;
 
 for(int k = 0; k < currentDate.length; k++)
 {
 currentDate[k] = currentDate[k].replaceAll("/", "-");
 firstIndex = currentDate[k].indexOf("-");
 lastIndex = currentDate[k].lastIndexOf("-");
 switchNum = Integer.parseInt(currentDate[k].substring(1, firstIndex));
 switch(switchNum)
 {
 case 01: month =  "January";
 break;
 case 02: month = "February";
 break;
 case 03: month = "March";
 break;
 case 04: month = "April";
 break;
 case 05: month = "May";
 break;
 case 06: month = "June";
 break;
 case 07: month = "July";
 break;
 case 8: month = "August";
 break;
 case 9: month = "September";
 break;
 case 10: month = "October";
 break;
 case 11: month = "November";
 break;
 case 12: month = "December";
 break;
 }

 newDateArray[k] = month + " 20" + currentDate[k].substring(lastIndex + 1); 
 }
 
 return newDateArray;
 }
 
 }//closes the StudentReport class