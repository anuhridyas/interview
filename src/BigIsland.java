public class BigIsland {
    /**
     * @param grid: a 2d boolean array
     * @param k: an integer
     * @return: the number of Islands
     */
    public int numsofIsland(boolean[][] grid, int k) {
        // Write your code here


        int row = grid.length ;
        int col =grid[0].length ;

        int count =0;
        int[] cnt =new int[1];

        boolean[][]  visited =new boolean[row][col];


        for(int i =0 ; i < row ; i++ ){
            for(int j =0 ; j < col ; j++){

                if(visited[i][j] || grid[i][j]==false){
                    continue;
                }

                cnt[0]=0;
                if(dfs(grid,visited , i , j , k,cnt )){
                    count++;
                }


            }
        }

        return count;
    }


    private boolean dfs(boolean[][] grid , boolean[][] visited , int row , int col , int k, int[] cnt ){


        if(row < 0 || row >= grid.length || col <0 || col >= grid[0].length ||! grid[row][col] ||
                visited[row][col]){
            return false ;
        }

        if(grid[row][col]  ){
            cnt[0]+=1;
            if(cnt[0]>=k){
                return true;
            }

        }

        visited[row][col] =true ;

        return dfs(grid,visited , row+1 , col , k,cnt)||
                dfs(grid, visited , row-1 , col , k,cnt )||
                dfs( grid , visited , row , col+1 , k,cnt )||
                dfs(grid , visited , row , col-1 ,k,cnt);





    }


    public  static  void main(String[] args){
        boolean[][] arr={{true,true,false,false,false},{false,true,false,false,true},{false,false,false,true,true},{false,false,false,false,false},{false,false,false,false,true}};

        BigIsland bigIsland =new BigIsland();
        bigIsland.numsofIsland(arr,2);

    }
}