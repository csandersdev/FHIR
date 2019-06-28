/**
 * (C) Copyright IBM Corp. 2019
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.ibm.watsonhealth.fhir.model.resource;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.annotation.Generated;

import com.ibm.watsonhealth.fhir.model.type.BackboneElement;
import com.ibm.watsonhealth.fhir.model.type.Code;
import com.ibm.watsonhealth.fhir.model.type.CodeableConcept;
import com.ibm.watsonhealth.fhir.model.type.DateTime;
import com.ibm.watsonhealth.fhir.model.type.DetectedIssueSeverity;
import com.ibm.watsonhealth.fhir.model.type.DetectedIssueStatus;
import com.ibm.watsonhealth.fhir.model.type.Element;
import com.ibm.watsonhealth.fhir.model.type.Extension;
import com.ibm.watsonhealth.fhir.model.type.Id;
import com.ibm.watsonhealth.fhir.model.type.Identifier;
import com.ibm.watsonhealth.fhir.model.type.Meta;
import com.ibm.watsonhealth.fhir.model.type.Narrative;
import com.ibm.watsonhealth.fhir.model.type.Period;
import com.ibm.watsonhealth.fhir.model.type.Reference;
import com.ibm.watsonhealth.fhir.model.type.String;
import com.ibm.watsonhealth.fhir.model.type.Uri;
import com.ibm.watsonhealth.fhir.model.util.ValidationSupport;
import com.ibm.watsonhealth.fhir.model.visitor.Visitor;

/**
 * <p>
 * Indicates an actual or potential clinical issue with or between one or more active or proposed clinical actions for a 
 * patient; e.g. Drug-drug interaction, Ineffective treatment frequency, Procedure-condition conflict, etc.
 * </p>
 */
@Generated("com.ibm.watsonhealth.fhir.tools.CodeGenerator")
public class DetectedIssue extends DomainResource {
    private final List<Identifier> identifier;
    private final DetectedIssueStatus status;
    private final CodeableConcept code;
    private final DetectedIssueSeverity severity;
    private final Reference patient;
    private final Element identified;
    private final Reference author;
    private final List<Reference> implicated;
    private final List<Evidence> evidence;
    private final String detail;
    private final Uri reference;
    private final List<Mitigation> mitigation;

    private DetectedIssue(Builder builder) {
        super(builder);
        identifier = Collections.unmodifiableList(builder.identifier);
        status = ValidationSupport.requireNonNull(builder.status, "status");
        code = builder.code;
        severity = builder.severity;
        patient = builder.patient;
        identified = ValidationSupport.choiceElement(builder.identified, "identified", DateTime.class, Period.class);
        author = builder.author;
        implicated = Collections.unmodifiableList(builder.implicated);
        evidence = Collections.unmodifiableList(builder.evidence);
        detail = builder.detail;
        reference = builder.reference;
        mitigation = Collections.unmodifiableList(builder.mitigation);
    }

    /**
     * <p>
     * Business identifier associated with the detected issue record.
     * </p>
     * 
     * @return
     *     A list containing immutable objects of type {@link Identifier}.
     */
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    /**
     * <p>
     * Indicates the status of the detected issue.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link DetectedIssueStatus}.
     */
    public DetectedIssueStatus getStatus() {
        return status;
    }

    /**
     * <p>
     * Identifies the general type of issue identified.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link CodeableConcept}.
     */
    public CodeableConcept getCode() {
        return code;
    }

    /**
     * <p>
     * Indicates the degree of importance associated with the identified issue based on the potential impact on the patient.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link DetectedIssueSeverity}.
     */
    public DetectedIssueSeverity getSeverity() {
        return severity;
    }

    /**
     * <p>
     * Indicates the patient whose record the detected issue is associated with.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link Reference}.
     */
    public Reference getPatient() {
        return patient;
    }

    /**
     * <p>
     * The date or period when the detected issue was initially identified.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link Element}.
     */
    public Element getIdentified() {
        return identified;
    }

    /**
     * <p>
     * Individual or device responsible for the issue being raised. For example, a decision support application or a 
     * pharmacist conducting a medication review.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link Reference}.
     */
    public Reference getAuthor() {
        return author;
    }

    /**
     * <p>
     * Indicates the resource representing the current activity or proposed activity that is potentially problematic.
     * </p>
     * 
     * @return
     *     A list containing immutable objects of type {@link Reference}.
     */
    public List<Reference> getImplicated() {
        return implicated;
    }

    /**
     * <p>
     * Supporting evidence or manifestations that provide the basis for identifying the detected issue such as a 
     * GuidanceResponse or MeasureReport.
     * </p>
     * 
     * @return
     *     A list containing immutable objects of type {@link Evidence}.
     */
    public List<Evidence> getEvidence() {
        return evidence;
    }

    /**
     * <p>
     * A textual explanation of the detected issue.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link String}.
     */
    public String getDetail() {
        return detail;
    }

    /**
     * <p>
     * The literature, knowledge-base or similar reference that describes the propensity for the detected issue identified.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link Uri}.
     */
    public Uri getReference() {
        return reference;
    }

    /**
     * <p>
     * Indicates an action that has been taken or is committed to reduce or eliminate the likelihood of the risk identified 
     * by the detected issue from manifesting. Can also reflect an observation of known mitigating factors that may 
     * reduce/eliminate the need for any action.
     * </p>
     * 
     * @return
     *     A list containing immutable objects of type {@link Mitigation}.
     */
    public List<Mitigation> getMitigation() {
        return mitigation;
    }

    @Override
    public void accept(java.lang.String elementName, Visitor visitor) {
        if (visitor.preVisit(this)) {
            visitor.visitStart(elementName, this);
            if (visitor.visit(elementName, this)) {
                // visit children
                accept(id, "id", visitor);
                accept(meta, "meta", visitor);
                accept(implicitRules, "implicitRules", visitor);
                accept(language, "language", visitor);
                accept(text, "text", visitor);
                accept(contained, "contained", visitor, Resource.class);
                accept(extension, "extension", visitor, Extension.class);
                accept(modifierExtension, "modifierExtension", visitor, Extension.class);
                accept(identifier, "identifier", visitor, Identifier.class);
                accept(status, "status", visitor);
                accept(code, "code", visitor);
                accept(severity, "severity", visitor);
                accept(patient, "patient", visitor);
                accept(identified, "identified", visitor, true);
                accept(author, "author", visitor);
                accept(implicated, "implicated", visitor, Reference.class);
                accept(evidence, "evidence", visitor, Evidence.class);
                accept(detail, "detail", visitor);
                accept(reference, "reference", visitor);
                accept(mitigation, "mitigation", visitor, Mitigation.class);
            }
            visitor.visitEnd(elementName, this);
            visitor.postVisit(this);
        }
    }

    @Override
    public Builder toBuilder() {
        Builder builder = new Builder(status);
        builder.id = id;
        builder.meta = meta;
        builder.implicitRules = implicitRules;
        builder.language = language;
        builder.text = text;
        builder.contained.addAll(contained);
        builder.extension.addAll(extension);
        builder.modifierExtension.addAll(modifierExtension);
        builder.identifier.addAll(identifier);
        builder.code = code;
        builder.severity = severity;
        builder.patient = patient;
        builder.identified = identified;
        builder.author = author;
        builder.implicated.addAll(implicated);
        builder.evidence.addAll(evidence);
        builder.detail = detail;
        builder.reference = reference;
        builder.mitigation.addAll(mitigation);
        return builder;
    }

    public static Builder builder(DetectedIssueStatus status) {
        return new Builder(status);
    }

    public static class Builder extends DomainResource.Builder {
        // required
        private final DetectedIssueStatus status;

        // optional
        private List<Identifier> identifier = new ArrayList<>();
        private CodeableConcept code;
        private DetectedIssueSeverity severity;
        private Reference patient;
        private Element identified;
        private Reference author;
        private List<Reference> implicated = new ArrayList<>();
        private List<Evidence> evidence = new ArrayList<>();
        private String detail;
        private Uri reference;
        private List<Mitigation> mitigation = new ArrayList<>();

        private Builder(DetectedIssueStatus status) {
            super();
            this.status = status;
        }

        /**
         * <p>
         * The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
         * </p>
         * 
         * @param id
         *     Logical id of this artifact
         * 
         * @return
         *     A reference to this Builder instance.
         */
        @Override
        public Builder id(Id id) {
            return (Builder) super.id(id);
        }

        /**
         * <p>
         * The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content 
         * might not always be associated with version changes to the resource.
         * </p>
         * 
         * @param meta
         *     Metadata about the resource
         * 
         * @return
         *     A reference to this Builder instance.
         */
        @Override
        public Builder meta(Meta meta) {
            return (Builder) super.meta(meta);
        }

        /**
         * <p>
         * A reference to a set of rules that were followed when the resource was constructed, and which must be understood when 
         * processing the content. Often, this is a reference to an implementation guide that defines the special rules along 
         * with other profiles etc.
         * </p>
         * 
         * @param implicitRules
         *     A set of rules under which this content was created
         * 
         * @return
         *     A reference to this Builder instance.
         */
        @Override
        public Builder implicitRules(Uri implicitRules) {
            return (Builder) super.implicitRules(implicitRules);
        }

        /**
         * <p>
         * The base language in which the resource is written.
         * </p>
         * 
         * @param language
         *     Language of the resource content
         * 
         * @return
         *     A reference to this Builder instance.
         */
        @Override
        public Builder language(Code language) {
            return (Builder) super.language(language);
        }

        /**
         * <p>
         * A human-readable narrative that contains a summary of the resource and can be used to represent the content of the 
         * resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient 
         * detail to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what 
         * content should be represented in the narrative to ensure clinical safety.
         * </p>
         * 
         * @param text
         *     Text summary of the resource, for human interpretation
         * 
         * @return
         *     A reference to this Builder instance.
         */
        @Override
        public Builder text(Narrative text) {
            return (Builder) super.text(text);
        }

        /**
         * <p>
         * These resources do not have an independent existence apart from the resource that contains them - they cannot be 
         * identified independently, and nor can they have their own independent transaction scope.
         * </p>
         * 
         * @param contained
         *     Contained, inline Resources
         * 
         * @return
         *     A reference to this Builder instance.
         */
        @Override
        public Builder contained(Resource... contained) {
            return (Builder) super.contained(contained);
        }

        /**
         * <p>
         * These resources do not have an independent existence apart from the resource that contains them - they cannot be 
         * identified independently, and nor can they have their own independent transaction scope.
         * </p>
         * 
         * @param contained
         *     Contained, inline Resources
         * 
         * @return
         *     A reference to this Builder instance.
         */
        @Override
        public Builder contained(Collection<Resource> contained) {
            return (Builder) super.contained(contained);
        }

        /**
         * <p>
         * May be used to represent additional information that is not part of the basic definition of the resource. To make the 
         * use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of 
         * extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part 
         * of the definition of the extension.
         * </p>
         * 
         * @param extension
         *     Additional content defined by implementations
         * 
         * @return
         *     A reference to this Builder instance.
         */
        @Override
        public Builder extension(Extension... extension) {
            return (Builder) super.extension(extension);
        }

        /**
         * <p>
         * May be used to represent additional information that is not part of the basic definition of the resource. To make the 
         * use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of 
         * extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part 
         * of the definition of the extension.
         * </p>
         * 
         * @param extension
         *     Additional content defined by implementations
         * 
         * @return
         *     A reference to this Builder instance.
         */
        @Override
        public Builder extension(Collection<Extension> extension) {
            return (Builder) super.extension(extension);
        }

        /**
         * <p>
         * May be used to represent additional information that is not part of the basic definition of the resource and that 
         * modifies the understanding of the element that contains it and/or the understanding of the containing element's 
         * descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and 
         * manageable, there is a strict set of governance applied to the definition and use of extensions. Though any 
         * implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the 
         * definition of the extension. Applications processing a resource are required to check for modifier extensions.
         * </p>
         * <p>
         * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot 
         * change the meaning of modifierExtension itself).
         * </p>
         * 
         * @param modifierExtension
         *     Extensions that cannot be ignored
         * 
         * @return
         *     A reference to this Builder instance.
         */
        @Override
        public Builder modifierExtension(Extension... modifierExtension) {
            return (Builder) super.modifierExtension(modifierExtension);
        }

        /**
         * <p>
         * May be used to represent additional information that is not part of the basic definition of the resource and that 
         * modifies the understanding of the element that contains it and/or the understanding of the containing element's 
         * descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and 
         * manageable, there is a strict set of governance applied to the definition and use of extensions. Though any 
         * implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the 
         * definition of the extension. Applications processing a resource are required to check for modifier extensions.
         * </p>
         * <p>
         * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot 
         * change the meaning of modifierExtension itself).
         * </p>
         * 
         * @param modifierExtension
         *     Extensions that cannot be ignored
         * 
         * @return
         *     A reference to this Builder instance.
         */
        @Override
        public Builder modifierExtension(Collection<Extension> modifierExtension) {
            return (Builder) super.modifierExtension(modifierExtension);
        }

        /**
         * <p>
         * Business identifier associated with the detected issue record.
         * </p>
         * 
         * @param identifier
         *     Unique id for the detected issue
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder identifier(Identifier... identifier) {
            for (Identifier value : identifier) {
                this.identifier.add(value);
            }
            return this;
        }

        /**
         * <p>
         * Business identifier associated with the detected issue record.
         * </p>
         * 
         * @param identifier
         *     Unique id for the detected issue
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder identifier(Collection<Identifier> identifier) {
            this.identifier.addAll(identifier);
            return this;
        }

        /**
         * <p>
         * Identifies the general type of issue identified.
         * </p>
         * 
         * @param code
         *     Issue Category, e.g. drug-drug, duplicate therapy, etc.
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder code(CodeableConcept code) {
            this.code = code;
            return this;
        }

        /**
         * <p>
         * Indicates the degree of importance associated with the identified issue based on the potential impact on the patient.
         * </p>
         * 
         * @param severity
         *     high | moderate | low
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder severity(DetectedIssueSeverity severity) {
            this.severity = severity;
            return this;
        }

        /**
         * <p>
         * Indicates the patient whose record the detected issue is associated with.
         * </p>
         * 
         * @param patient
         *     Associated patient
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder patient(Reference patient) {
            this.patient = patient;
            return this;
        }

        /**
         * <p>
         * The date or period when the detected issue was initially identified.
         * </p>
         * 
         * @param identified
         *     When identified
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder identified(Element identified) {
            this.identified = identified;
            return this;
        }

        /**
         * <p>
         * Individual or device responsible for the issue being raised. For example, a decision support application or a 
         * pharmacist conducting a medication review.
         * </p>
         * 
         * @param author
         *     The provider or device that identified the issue
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder author(Reference author) {
            this.author = author;
            return this;
        }

        /**
         * <p>
         * Indicates the resource representing the current activity or proposed activity that is potentially problematic.
         * </p>
         * 
         * @param implicated
         *     Problem resource
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder implicated(Reference... implicated) {
            for (Reference value : implicated) {
                this.implicated.add(value);
            }
            return this;
        }

        /**
         * <p>
         * Indicates the resource representing the current activity or proposed activity that is potentially problematic.
         * </p>
         * 
         * @param implicated
         *     Problem resource
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder implicated(Collection<Reference> implicated) {
            this.implicated.addAll(implicated);
            return this;
        }

        /**
         * <p>
         * Supporting evidence or manifestations that provide the basis for identifying the detected issue such as a 
         * GuidanceResponse or MeasureReport.
         * </p>
         * 
         * @param evidence
         *     Supporting evidence
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder evidence(Evidence... evidence) {
            for (Evidence value : evidence) {
                this.evidence.add(value);
            }
            return this;
        }

        /**
         * <p>
         * Supporting evidence or manifestations that provide the basis for identifying the detected issue such as a 
         * GuidanceResponse or MeasureReport.
         * </p>
         * 
         * @param evidence
         *     Supporting evidence
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder evidence(Collection<Evidence> evidence) {
            this.evidence.addAll(evidence);
            return this;
        }

        /**
         * <p>
         * A textual explanation of the detected issue.
         * </p>
         * 
         * @param detail
         *     Description and context
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder detail(String detail) {
            this.detail = detail;
            return this;
        }

        /**
         * <p>
         * The literature, knowledge-base or similar reference that describes the propensity for the detected issue identified.
         * </p>
         * 
         * @param reference
         *     Authority for issue
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder reference(Uri reference) {
            this.reference = reference;
            return this;
        }

        /**
         * <p>
         * Indicates an action that has been taken or is committed to reduce or eliminate the likelihood of the risk identified 
         * by the detected issue from manifesting. Can also reflect an observation of known mitigating factors that may 
         * reduce/eliminate the need for any action.
         * </p>
         * 
         * @param mitigation
         *     Step taken to address
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder mitigation(Mitigation... mitigation) {
            for (Mitigation value : mitigation) {
                this.mitigation.add(value);
            }
            return this;
        }

        /**
         * <p>
         * Indicates an action that has been taken or is committed to reduce or eliminate the likelihood of the risk identified 
         * by the detected issue from manifesting. Can also reflect an observation of known mitigating factors that may 
         * reduce/eliminate the need for any action.
         * </p>
         * 
         * @param mitigation
         *     Step taken to address
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder mitigation(Collection<Mitigation> mitigation) {
            this.mitigation.addAll(mitigation);
            return this;
        }

        @Override
        public DetectedIssue build() {
            return new DetectedIssue(this);
        }
    }

    /**
     * <p>
     * Supporting evidence or manifestations that provide the basis for identifying the detected issue such as a 
     * GuidanceResponse or MeasureReport.
     * </p>
     */
    public static class Evidence extends BackboneElement {
        private final List<CodeableConcept> code;
        private final List<Reference> detail;

        private Evidence(Builder builder) {
            super(builder);
            code = Collections.unmodifiableList(builder.code);
            detail = Collections.unmodifiableList(builder.detail);
        }

        /**
         * <p>
         * A manifestation that led to the recording of this detected issue.
         * </p>
         * 
         * @return
         *     A list containing immutable objects of type {@link CodeableConcept}.
         */
        public List<CodeableConcept> getCode() {
            return code;
        }

        /**
         * <p>
         * Links to resources that constitute evidence for the detected issue such as a GuidanceResponse or MeasureReport.
         * </p>
         * 
         * @return
         *     A list containing immutable objects of type {@link Reference}.
         */
        public List<Reference> getDetail() {
            return detail;
        }

        @Override
        public void accept(java.lang.String elementName, Visitor visitor) {
            if (visitor.preVisit(this)) {
                visitor.visitStart(elementName, this);
                if (visitor.visit(elementName, this)) {
                    // visit children
                    accept(id, "id", visitor);
                    accept(extension, "extension", visitor, Extension.class);
                    accept(modifierExtension, "modifierExtension", visitor, Extension.class);
                    accept(code, "code", visitor, CodeableConcept.class);
                    accept(detail, "detail", visitor, Reference.class);
                }
                visitor.visitEnd(elementName, this);
                visitor.postVisit(this);
            }
        }

        @Override
        public Builder toBuilder() {
            return Builder.from(this);
        }

        public static Builder builder() {
            return new Builder();
        }

        public static class Builder extends BackboneElement.Builder {
            // optional
            private List<CodeableConcept> code = new ArrayList<>();
            private List<Reference> detail = new ArrayList<>();

            private Builder() {
                super();
            }

            /**
             * <p>
             * Unique id for the element within a resource (for internal references). This may be any string value that does not 
             * contain spaces.
             * </p>
             * 
             * @param id
             *     Unique id for inter-element referencing
             * 
             * @return
             *     A reference to this Builder instance.
             */
            @Override
            public Builder id(java.lang.String id) {
                return (Builder) super.id(id);
            }

            /**
             * <p>
             * May be used to represent additional information that is not part of the basic definition of the element. To make the 
             * use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of 
             * extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part 
             * of the definition of the extension.
             * </p>
             * 
             * @param extension
             *     Additional content defined by implementations
             * 
             * @return
             *     A reference to this Builder instance.
             */
            @Override
            public Builder extension(Extension... extension) {
                return (Builder) super.extension(extension);
            }

            /**
             * <p>
             * May be used to represent additional information that is not part of the basic definition of the element. To make the 
             * use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of 
             * extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part 
             * of the definition of the extension.
             * </p>
             * 
             * @param extension
             *     Additional content defined by implementations
             * 
             * @return
             *     A reference to this Builder instance.
             */
            @Override
            public Builder extension(Collection<Extension> extension) {
                return (Builder) super.extension(extension);
            }

            /**
             * <p>
             * May be used to represent additional information that is not part of the basic definition of the element and that 
             * modifies the understanding of the element in which it is contained and/or the understanding of the containing 
             * element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe 
             * and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any 
             * implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the 
             * extension. Applications processing a resource are required to check for modifier extensions.
             * </p>
             * <p>
             * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot 
             * change the meaning of modifierExtension itself).
             * </p>
             * 
             * @param modifierExtension
             *     Extensions that cannot be ignored even if unrecognized
             * 
             * @return
             *     A reference to this Builder instance.
             */
            @Override
            public Builder modifierExtension(Extension... modifierExtension) {
                return (Builder) super.modifierExtension(modifierExtension);
            }

            /**
             * <p>
             * May be used to represent additional information that is not part of the basic definition of the element and that 
             * modifies the understanding of the element in which it is contained and/or the understanding of the containing 
             * element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe 
             * and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any 
             * implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the 
             * extension. Applications processing a resource are required to check for modifier extensions.
             * </p>
             * <p>
             * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot 
             * change the meaning of modifierExtension itself).
             * </p>
             * 
             * @param modifierExtension
             *     Extensions that cannot be ignored even if unrecognized
             * 
             * @return
             *     A reference to this Builder instance.
             */
            @Override
            public Builder modifierExtension(Collection<Extension> modifierExtension) {
                return (Builder) super.modifierExtension(modifierExtension);
            }

            /**
             * <p>
             * A manifestation that led to the recording of this detected issue.
             * </p>
             * 
             * @param code
             *     Manifestation
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder code(CodeableConcept... code) {
                for (CodeableConcept value : code) {
                    this.code.add(value);
                }
                return this;
            }

            /**
             * <p>
             * A manifestation that led to the recording of this detected issue.
             * </p>
             * 
             * @param code
             *     Manifestation
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder code(Collection<CodeableConcept> code) {
                this.code.addAll(code);
                return this;
            }

            /**
             * <p>
             * Links to resources that constitute evidence for the detected issue such as a GuidanceResponse or MeasureReport.
             * </p>
             * 
             * @param detail
             *     Supporting information
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder detail(Reference... detail) {
                for (Reference value : detail) {
                    this.detail.add(value);
                }
                return this;
            }

            /**
             * <p>
             * Links to resources that constitute evidence for the detected issue such as a GuidanceResponse or MeasureReport.
             * </p>
             * 
             * @param detail
             *     Supporting information
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder detail(Collection<Reference> detail) {
                this.detail.addAll(detail);
                return this;
            }

            @Override
            public Evidence build() {
                return new Evidence(this);
            }

            private static Builder from(Evidence evidence) {
                Builder builder = new Builder();
                builder.code.addAll(evidence.code);
                builder.detail.addAll(evidence.detail);
                return builder;
            }
        }
    }

    /**
     * <p>
     * Indicates an action that has been taken or is committed to reduce or eliminate the likelihood of the risk identified 
     * by the detected issue from manifesting. Can also reflect an observation of known mitigating factors that may 
     * reduce/eliminate the need for any action.
     * </p>
     */
    public static class Mitigation extends BackboneElement {
        private final CodeableConcept action;
        private final DateTime date;
        private final Reference author;

        private Mitigation(Builder builder) {
            super(builder);
            action = ValidationSupport.requireNonNull(builder.action, "action");
            date = builder.date;
            author = builder.author;
        }

        /**
         * <p>
         * Describes the action that was taken or the observation that was made that reduces/eliminates the risk associated with 
         * the identified issue.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link CodeableConcept}.
         */
        public CodeableConcept getAction() {
            return action;
        }

        /**
         * <p>
         * Indicates when the mitigating action was documented.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link DateTime}.
         */
        public DateTime getDate() {
            return date;
        }

        /**
         * <p>
         * Identifies the practitioner who determined the mitigation and takes responsibility for the mitigation step occurring.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link Reference}.
         */
        public Reference getAuthor() {
            return author;
        }

        @Override
        public void accept(java.lang.String elementName, Visitor visitor) {
            if (visitor.preVisit(this)) {
                visitor.visitStart(elementName, this);
                if (visitor.visit(elementName, this)) {
                    // visit children
                    accept(id, "id", visitor);
                    accept(extension, "extension", visitor, Extension.class);
                    accept(modifierExtension, "modifierExtension", visitor, Extension.class);
                    accept(action, "action", visitor);
                    accept(date, "date", visitor);
                    accept(author, "author", visitor);
                }
                visitor.visitEnd(elementName, this);
                visitor.postVisit(this);
            }
        }

        @Override
        public Builder toBuilder() {
            return Builder.from(this);
        }

        public static Builder builder(CodeableConcept action) {
            return new Builder(action);
        }

        public static class Builder extends BackboneElement.Builder {
            // required
            private final CodeableConcept action;

            // optional
            private DateTime date;
            private Reference author;

            private Builder(CodeableConcept action) {
                super();
                this.action = action;
            }

            /**
             * <p>
             * Unique id for the element within a resource (for internal references). This may be any string value that does not 
             * contain spaces.
             * </p>
             * 
             * @param id
             *     Unique id for inter-element referencing
             * 
             * @return
             *     A reference to this Builder instance.
             */
            @Override
            public Builder id(java.lang.String id) {
                return (Builder) super.id(id);
            }

            /**
             * <p>
             * May be used to represent additional information that is not part of the basic definition of the element. To make the 
             * use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of 
             * extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part 
             * of the definition of the extension.
             * </p>
             * 
             * @param extension
             *     Additional content defined by implementations
             * 
             * @return
             *     A reference to this Builder instance.
             */
            @Override
            public Builder extension(Extension... extension) {
                return (Builder) super.extension(extension);
            }

            /**
             * <p>
             * May be used to represent additional information that is not part of the basic definition of the element. To make the 
             * use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of 
             * extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part 
             * of the definition of the extension.
             * </p>
             * 
             * @param extension
             *     Additional content defined by implementations
             * 
             * @return
             *     A reference to this Builder instance.
             */
            @Override
            public Builder extension(Collection<Extension> extension) {
                return (Builder) super.extension(extension);
            }

            /**
             * <p>
             * May be used to represent additional information that is not part of the basic definition of the element and that 
             * modifies the understanding of the element in which it is contained and/or the understanding of the containing 
             * element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe 
             * and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any 
             * implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the 
             * extension. Applications processing a resource are required to check for modifier extensions.
             * </p>
             * <p>
             * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot 
             * change the meaning of modifierExtension itself).
             * </p>
             * 
             * @param modifierExtension
             *     Extensions that cannot be ignored even if unrecognized
             * 
             * @return
             *     A reference to this Builder instance.
             */
            @Override
            public Builder modifierExtension(Extension... modifierExtension) {
                return (Builder) super.modifierExtension(modifierExtension);
            }

            /**
             * <p>
             * May be used to represent additional information that is not part of the basic definition of the element and that 
             * modifies the understanding of the element in which it is contained and/or the understanding of the containing 
             * element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe 
             * and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any 
             * implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the 
             * extension. Applications processing a resource are required to check for modifier extensions.
             * </p>
             * <p>
             * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot 
             * change the meaning of modifierExtension itself).
             * </p>
             * 
             * @param modifierExtension
             *     Extensions that cannot be ignored even if unrecognized
             * 
             * @return
             *     A reference to this Builder instance.
             */
            @Override
            public Builder modifierExtension(Collection<Extension> modifierExtension) {
                return (Builder) super.modifierExtension(modifierExtension);
            }

            /**
             * <p>
             * Indicates when the mitigating action was documented.
             * </p>
             * 
             * @param date
             *     Date committed
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder date(DateTime date) {
                this.date = date;
                return this;
            }

            /**
             * <p>
             * Identifies the practitioner who determined the mitigation and takes responsibility for the mitigation step occurring.
             * </p>
             * 
             * @param author
             *     Who is committing?
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder author(Reference author) {
                this.author = author;
                return this;
            }

            @Override
            public Mitigation build() {
                return new Mitigation(this);
            }

            private static Builder from(Mitigation mitigation) {
                Builder builder = new Builder(mitigation.action);
                builder.date = mitigation.date;
                builder.author = mitigation.author;
                return builder;
            }
        }
    }
}
