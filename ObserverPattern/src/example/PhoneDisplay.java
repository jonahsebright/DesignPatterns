package example;

public class PhoneDisplay implements Observer<Integer> {

    @Override
    public void update(Integer data) {
        int temperature = data;
    }
}
