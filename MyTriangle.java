/* SOFTWARE TEST Lab 1 - JunitTest
 *		Name:ChengChangfeng ³Ì²ı·æ	
 * 		StuNum:3013218104
 */
package STlab1JunitTest;

public class MyTriangle {
    //Function triangle is set to judge the triangle and return the string.
	public String triangle(int a, int b, int c){
        if(isTriangle(a, b, c)){
            if(a == b && b == c){
                return "equilateral";
            }else if(a == b || b == c || a == c){
                return "isosceles";
            }else{
                return "scalene";
            }
        }else{
            return "non-triangle";
        }
    }
	
	//Function isTriangle is set to judge whether the input triangle exist.
    private boolean isTriangle(int a, int b, int c){
        if(a + b > c && a + c > b && b + c > a){
            return true;
        }else{
            return false;
        }
    }
}