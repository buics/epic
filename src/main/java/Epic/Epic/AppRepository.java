package Epic.Epic;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "epic", path = "epic")
public interface AppRepository extends MongoRepository<Epic,String>{
}


