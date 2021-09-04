import java.util.Stack;

/*
 * This class is for storing borrowable books which extends the read-only book for acquiring similar properties.
 */
public class BorrowableBook extends ReadOnlyBook {

	// creating field members for dates
	private String checkOutDate, dueDate;

	/*
	 * This method overrides the super class method and push the book info to the
	 * sub_stack. After that the sub_stack is pushed into the main stack.
	 */
	@Override
	public void add() {
		Stack<String> stack = new Stack<>();
		if (!getDueDate().isEmpty()) {
			stack.push(getDueDate());
			stack.push(getCheckOutDate());
		}
		stack.push(getPublisher());
		stack.push(getAuthor());
		stack.push(getBookTitle());
		stack.push(getBookIsbn());
		stack.push(getBookId());
		book.push(stack);
	}

	/*
	 * This method helps to initialize members to empty to avoid null-pointer
	 * exception
	 */
	public void initial() {
		this.checkOutDate = "";
		this.dueDate = "";
	}

	/*
	 * This is a setter method, which helps to set the dates
	 */
	public void setDate(String checkOutDate, String dueDate) {
		this.checkOutDate = checkOutDate;
		this.dueDate = dueDate;
	}

	/*
	 * These are getter methods
	 */
	private String getCheckOutDate() {
		return checkOutDate;
	}

	private String getDueDate() {
		return dueDate;
	}

}
