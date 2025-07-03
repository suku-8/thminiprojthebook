package thminiprojthebook.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import thminiprojthebook.domain.*;

@Component
public class PointHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Point>> {

    @Override
    public EntityModel<Point> process(EntityModel<Point> model) {
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/pointrecharge")
                .withRel("pointrecharge")
        );

        return model;
    }
}
