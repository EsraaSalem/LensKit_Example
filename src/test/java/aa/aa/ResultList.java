package aa.aa;
import java.util.List;

import org.grouplens.lenskit.eval.metrics.predict.HLUtilityPredictMetric.Result;

/**
 * A list of results from a recommender operation.  This is used for operations such as top-*N* recommendation that
 * produce a list (or occasionally set) of items.
 */
public interface ResultList extends List<Result> {
    /**
     * Return a list of the item (or user) IDs in this result list.
     *
     * @return The list of IDs.
     */
    List<Long> idList();
}