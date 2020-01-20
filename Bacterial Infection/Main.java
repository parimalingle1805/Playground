#include<stdio.h>

#define MAX_ROW_SIZE 20

unsigned int compute_infec_time_wrapper(int first_infec_room_row,
                                int first_infec_room_col,
                                int total_rows, int total_col);

int main() {
    // Input
  int total_rows, total_col;
  int first_infec_room_row, first_infec_room_col;
  int i,j;
 
  scanf("%d %d", &total_rows, &total_col);
  scanf("%d %d", &first_infec_room_row, &first_infec_room_col);

  int time_taken = compute_infec_time_wrapper(first_infec_room_row,
                                              first_infec_room_col,
                 total_rows, total_col);

  printf("%d ", time_taken);

  return 0;
}

void infec_t(int current_r, int current_col, int total_r,int total_col, unsigned int house_infec_t[][MAX_ROW_SIZE],unsigned int current_t)
{
if((current_r >= total_r) || (current_r < 0) || (current_col >= total_col)
      || (current_col < 0))
{
return;
}
if(current_t >= house_infec_t[current_r][current_col])
{
return;
}
house_infec_t[current_r][current_col] = current_t;
infec_t(current_r, current_col+1, total_r,total_col,house_infec_t,current_t+1);
infec_t(current_r-1, current_col, total_r, total_col, house_infec_t,current_t+1);
infec_t(current_r, current_col-1, total_r, total_col, house_infec_t, current_t+1);
infec_t(current_r+1, current_col, total_r, total_col, house_infec_t,current_t+1);
return;
}

unsigned int compute_infec_time_wrapper(int first_infec_room_row,
                                int first_infec_room_col,
                                int total_rows, int total_col)
{
  unsigned int house_infec_t[MAX_ROW_SIZE][MAX_ROW_SIZE];
int i,j;
for(i=0;i<total_rows;i++)
{
for(j=0;j<total_col;j++)
{
house_infec_t[i][j] = -1;
}
}
infec_t(first_infec_room_row, first_infec_room_col, total_rows, total_col, house_infec_t,1);
int max = house_infec_t[0][0];
for(i=0;i<total_rows;i++)
{
for(j=0;j<total_col;j++)
{
if((max < house_infec_t[i][j]))
            {
max = house_infec_t[i][j];
            }
}
}
return max;
}   