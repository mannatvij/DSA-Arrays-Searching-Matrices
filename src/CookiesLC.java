import java.util.Arrays;

public class CookiesLC {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int contentchildren=0;
        for(int cookies=0; (contentchildren<g.length && cookies<s.length); cookies++){
            if( s[cookies] >= g[contentchildren]){
                contentchildren++;
            }
        }
        return contentchildren;
    }
    public static void main(String args[]){
        CookiesLC c = new CookiesLC();
        int g[]={1,2,3};
        int s[]={1,1};
        System.out.println(c.findContentChildren(g,s));
    }

}
