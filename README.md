# OCR-recipe-generator

This will be an improvised version of the one used for the TAMU HowdyHack 2022 competition [https://devpost.com/software/aggie-grocer] (Winner)

This project will use Spring Boot for the Backend, Frontend is still TBD but will most likely use React as that is something I have been meaning to play with.

# Current Problems
When testing the OCR, I am attemping to access files on my local machine with the File library but I believe that such things are not allowed by react. Instead, I am going to try and make a database that can store these images and allow me to access them to run the test OCR method. The test OCR method works when called via GET method by postman, so we can at least confirm that the OCR is working as expected on my machine.
