
package vn.hcmute.service;

import java.util.List;
import java.util.Optional;

import vn.hcmute.entities.PostEntity;
import vn.hcmute.model.PostModel;


public interface IPostService {

	List<PostModel> findByUserUserID(long userId);

	<S extends PostEntity> S save(S entity);
	
	Optional<PostEntity> findById(Long id);


	List<PostModel> getPostsByGroupId(long groupId, int page, int size, long userid);


	List<PostEntity> findAll();


	void deleteById(Long id);


	boolean existsById(Long id);

}