package stackandquee;

public class QueueeUseA {

	public static void main(String[] args) {
		QueueUsingArray queue =new QueueUsingArray();
		for(int i=0;i<15;i++)
		{
			try {
				queue.enquee(i);
			} catch (QueueFullException e) {
//				e.printStackTrace();
			}
		}
		while(!queue.isEmpty())
		{
			try {
				System.out.println(queue.dequee());
			} catch (QueueEmptyException e) {
//				e.printStackTrace();
			}
		}

	}

}
