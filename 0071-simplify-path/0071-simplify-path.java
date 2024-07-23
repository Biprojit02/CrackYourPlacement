class Solution {
    public String simplifyPath(String path) {
        String[] tokens = path.split("/");
        Stack<String> stack = new Stack<>();

        for(String token : tokens){        
            if(token.equals("") || token.equals(".")){
                continue;
            }
            else if(token.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else{
                stack.push(token);
            }
        }

        StringBuilder result = new StringBuilder();
        for(String dir : stack){
            result.append("/").append(dir);
        }
        return result.length() > 0 ? result.toString() : "/";
    }   
}

