/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.highj.data.transformer.error_arrow;

import org.highj.__;
import org.highj.____;
import org.highj.data.collection.Either;
import org.highj.data.transformer.ErrorArrow;
import org.highj.typeclass2.arrow.ArrowTransformer;

/**
 *
 * @author clintonselke
 */
public interface ErrorArrowArrowTransformer<EX,A> extends ErrorArrowArrow<EX,A>, ArrowTransformer<____.µ<ErrorArrow.µ,EX>,A> {

    @Override
    public default <B, C> ErrorArrow<EX, A, B, C> lift(__<A, B, C> arrow) {
        return ErrorArrow.errorArrow(a().dot(a().arr(Either::newRight), arrow));
    }
}
