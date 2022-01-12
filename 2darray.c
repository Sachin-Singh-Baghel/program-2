#include <stdio.h>
int main()
{
  // declare and initialize an array
  int arr[3][2] = {{50,60},{70,80},{90,100}};
  
  // display 2D array using for loop
  printf("The Array elements are:\n");

  // outer loop for row
  for(int i=0; i<3; i++) {
    // inner loop for column
    for(int j=0; j<2; j++) {
      printf("%d ", arr[i][j]);
    }
    printf("\n"); // new line
  }

  return 0;
}
