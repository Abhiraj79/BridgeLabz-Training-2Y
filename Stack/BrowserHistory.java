import java.util.*;

class BrowserHistory {

    Stack<String> backStack;
    Stack<String> forwardStack;
    public BrowserHistory(String homepage) {
        backStack = new Stack<>();
        forwardStack = new Stack<>();
        backStack.push(homepage);
    }
    public void visit(String url) {
        backStack.push(url);
        forwardStack.clear(); // clear forward history
    }
    public String back(int steps) {                                                                                                             `
        while (steps > 0 && backStack.size() > 1) {
            forwardStack.push(backStack.pop());
            steps--;
        }
        return backStack.peek();
    }
    public String forward(int steps) {
        while (steps > 0 && !forwardStack.isEmpty()) {
            backStack.push(forwardStack.pop());
            steps--;
        }
        return backStack.peek();
    }
}