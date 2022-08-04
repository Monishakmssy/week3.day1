package week3.day1;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String text = "We learn java basics as part of java sessions in java week1";	
        int count=0;
        String[] split=text.split(" ");
        for (int i=0; i<split.length; i++) {
        for (int j=i+1; j<split.length; j++) {
        	if(split[i].equalsIgnoreCase(split[j])) {
        		split[j]=" ";
        		count++;
        	}
        }
        }
        if(count>1) {
        	for(int k=0; k<split.length; k++) {
        		System.out.print(split[k]+" ");
        	}
        }
	}

}