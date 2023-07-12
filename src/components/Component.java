package components;

import mediator.Mediator;
public interface Component {
    String getName();
    void setMediator(Mediator mediator);
}
