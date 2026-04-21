public class PassCheck {
    public static boolean isValidPass(String pass){
        int lcase=0,dig = 0;
        int len = pass.length();
        if(len<5 || len > 12){
            System.out.println("Please enter the passowrd length between 5 and 12(Both inclusive)");
            return false;
        }
        for(int i = 0 ; i<len ;i++){
            if(pass.charAt(i)<='9'&&pass.charAt(i)>='0') {dig++;}
            else if(pass.charAt(i)>='a'&&pass.charAt(i)<='z') {lcase++;}
            else if(pass.charAt(i)>='A'&&pass.charAt(i)<='Z'){
                System.out.println("Error: Upper case letters are not allowed in the password!");
                return false;
            }else{
                System.out.println("Error: Only Aphanumeric values are allowed(excluding uppercase)");
            }
        }
        if(lcase == 0){
            System.out.println("The password must contain at least one lcase");
            return false;
        }else if(dig ==0){
            System.out.println("the password must contain at least one dig");
            return false;
        }

        for(int i = 0 ; i<len ; i++){
            for(int j = i+1 ;j<len ; j++){
                if(pass.charAt(j)==pass.charAt(i)){
                    boolean isPattern = true;
                    int u = i;
                    int v = j;
                    while(u!=j-1 && v<len){
                        if(pass.charAt(u)!=pass.charAt(v)){
                            isPattern = false;
                            break;
                        }
                        u++;
                        v++;
                    }
                    if(u!=j-1 && v==len){
                        isPattern = false;
                    }
                    if(isPattern){
                        System.out.println("repeated pattern found!");
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        boolean test = isValidPass("santosh12121");
        System.out.println(test);
    }
}
