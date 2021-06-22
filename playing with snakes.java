class Hello {
    public int m(int[][] grid) {
        int n=grid.length;
        Queue<int[]> q=new LinkedList<>();
        int start[]=new int[]{0,0,0,0};
        HashSet<String> hs=new HashSet<>();
        q.add(start);
        while(q.size()>0)
        {
            int curr[]=q.poll();
            int r=curr[0];
            int c=curr[1];
            int dir=curr[2];
            int steps=curr[3];
            System.out.println(r+" "+c+" "+dir+" "+steps);
            if(dir==0 && r==n-1 && c==n-2)
                return steps;
            if(hs.contains(r+","+c+","+dir))
                continue;
            hs.add(r+","+c+","+dir);
            if(dir==0)
            {
                if(r+1<n && grid[r+1][c]+grid[r+1][c+1]==0){
                    q.add(new int[]{r+1,c,0,steps+1});
                    q.add(new int[]{r,c,1,steps+1});
                    }
                if(c+2<n && grid[r][c+2]==0)
                {
                 q.add(new int[]{r,c+1,0,steps+1});   
                }
            }
            else
            {
                if(c+1<n && grid[r][c+1]+grid[r+1][c+1]==0)
                {
                    q.add(new int[]{r,c+1,1,steps+1});
                    q.add(new int[]{r,c,0,steps+1});
                }
                if(r+2<n && grid[r+2][c]==0)
                    q.add(new int[]{r+1,c,1,steps+1});
            }
        }
        return -1;
    }
}
