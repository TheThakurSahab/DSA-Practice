Given a binary string A. It is allowed to do at most one swap between any 0 and 1. Find and return the length of the longest consecutive 1’s that can be achieved.


Input Format

The only argument given is string A.
Output Format

Return the length of the longest consecutive 1’s that can be achieved.
Constraints

1 <= length of string <= 1000000
A contains only characters 0 and 1.

 
int Solution::solve(string s) {
    int res = 1, n = s.size();
    int a = 0, cnt = 0, L = 0, R = 0;
    for(int i = 0; i < n; ++i)if(s[i]=='1')++R;
    for (int i = 0; i < n; ++i) {
        if (s[i]=='0')++cnt;
        else --R;
        while (a < i && cnt >= 2) {
            if (s[a]=='0')--cnt;
            else ++L;
            ++a;
        }
        int r = i - a + 1;
        if(cnt==0||max(L,R)>0)if (r > res) res = r;
    }
    
    return res;
}
