class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")) {
            System.out.println("0");
            return "0";
        }
        if(num1.equals("1")) {
            System.out.println(num2);
            return num2;
        }
        if(num2.equals("1")){
            System.out.println(num1);
            return num1;
        }

        
        
        
        
        int arr[] = new int[num1.length() + num2.length()];
        for (int i = num1.length() - 1; i >= 0; i--) {
            for (int j = num2.length() - 1; j >= 0; j--) {
                int product = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                // Adding previous values in result array into this product.
                product += arr[i + j + 1];

                // Adding the new product into the result array
                arr[i + j + 1] = product % 10;
                arr[i + j] += product / 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i: arr){
            if(sb.length()==0 && i==0) continue;
            else sb.append(i);
        }
        return sb.toString();
    }
}
