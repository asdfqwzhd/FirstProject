package com.greatProject.common.db;

import java.lang.annotation.Documented;

import org.seasar.doma.AnnotateWith;
import org.seasar.doma.Annotation;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.annotation.JsonSubTypes.Type;

@Documented
//@AnnotateWith(annotations = { @Annotation(target = Repository.class, type = ) })
public @interface AutoInject {

}
