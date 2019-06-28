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
import com.ibm.watsonhealth.fhir.model.type.Coding;
import com.ibm.watsonhealth.fhir.model.type.Duration;
import com.ibm.watsonhealth.fhir.model.type.EncounterLocationStatus;
import com.ibm.watsonhealth.fhir.model.type.EncounterStatus;
import com.ibm.watsonhealth.fhir.model.type.Extension;
import com.ibm.watsonhealth.fhir.model.type.Id;
import com.ibm.watsonhealth.fhir.model.type.Identifier;
import com.ibm.watsonhealth.fhir.model.type.Meta;
import com.ibm.watsonhealth.fhir.model.type.Narrative;
import com.ibm.watsonhealth.fhir.model.type.Period;
import com.ibm.watsonhealth.fhir.model.type.PositiveInt;
import com.ibm.watsonhealth.fhir.model.type.Reference;
import com.ibm.watsonhealth.fhir.model.type.Uri;
import com.ibm.watsonhealth.fhir.model.util.ValidationSupport;
import com.ibm.watsonhealth.fhir.model.visitor.Visitor;

/**
 * <p>
 * An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or 
 * assessing the health status of a patient.
 * </p>
 */
@Generated("com.ibm.watsonhealth.fhir.tools.CodeGenerator")
public class Encounter extends DomainResource {
    private final List<Identifier> identifier;
    private final EncounterStatus status;
    private final List<StatusHistory> statusHistory;
    private final Coding clazz;
    private final List<ClassHistory> classHistory;
    private final List<CodeableConcept> type;
    private final CodeableConcept serviceType;
    private final CodeableConcept priority;
    private final Reference subject;
    private final List<Reference> episodeOfCare;
    private final List<Reference> basedOn;
    private final List<Participant> participant;
    private final List<Reference> appointment;
    private final Period period;
    private final Duration length;
    private final List<CodeableConcept> reasonCode;
    private final List<Reference> reasonReference;
    private final List<Diagnosis> diagnosis;
    private final List<Reference> account;
    private final Hospitalization hospitalization;
    private final List<Location> location;
    private final Reference serviceProvider;
    private final Reference partOf;

    private Encounter(Builder builder) {
        super(builder);
        identifier = Collections.unmodifiableList(builder.identifier);
        status = ValidationSupport.requireNonNull(builder.status, "status");
        statusHistory = Collections.unmodifiableList(builder.statusHistory);
        clazz = ValidationSupport.requireNonNull(builder.clazz, "class");
        classHistory = Collections.unmodifiableList(builder.classHistory);
        type = Collections.unmodifiableList(builder.type);
        serviceType = builder.serviceType;
        priority = builder.priority;
        subject = builder.subject;
        episodeOfCare = Collections.unmodifiableList(builder.episodeOfCare);
        basedOn = Collections.unmodifiableList(builder.basedOn);
        participant = Collections.unmodifiableList(builder.participant);
        appointment = Collections.unmodifiableList(builder.appointment);
        period = builder.period;
        length = builder.length;
        reasonCode = Collections.unmodifiableList(builder.reasonCode);
        reasonReference = Collections.unmodifiableList(builder.reasonReference);
        diagnosis = Collections.unmodifiableList(builder.diagnosis);
        account = Collections.unmodifiableList(builder.account);
        hospitalization = builder.hospitalization;
        location = Collections.unmodifiableList(builder.location);
        serviceProvider = builder.serviceProvider;
        partOf = builder.partOf;
    }

    /**
     * <p>
     * Identifier(s) by which this encounter is known.
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
     * planned | arrived | triaged | in-progress | onleave | finished | cancelled +.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link EncounterStatus}.
     */
    public EncounterStatus getStatus() {
        return status;
    }

    /**
     * <p>
     * The status history permits the encounter resource to contain the status history without needing to read through the 
     * historical versions of the resource, or even have the server store them.
     * </p>
     * 
     * @return
     *     A list containing immutable objects of type {@link StatusHistory}.
     */
    public List<StatusHistory> getStatusHistory() {
        return statusHistory;
    }

    /**
     * <p>
     * Concepts representing classification of patient encounter such as ambulatory (outpatient), inpatient, emergency, home 
     * health or others due to local variations.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link Coding}.
     */
    public Coding getClazz() {
        return clazz;
    }

    /**
     * <p>
     * The class history permits the tracking of the encounters transitions without needing to go through the resource 
     * history. This would be used for a case where an admission starts of as an emergency encounter, then transitions into 
     * an inpatient scenario. Doing this and not restarting a new encounter ensures that any lab/diagnostic results can more 
     * easily follow the patient and not require re-processing and not get lost or cancelled during a kind of discharge from 
     * emergency to inpatient.
     * </p>
     * 
     * @return
     *     A list containing immutable objects of type {@link ClassHistory}.
     */
    public List<ClassHistory> getClassHistory() {
        return classHistory;
    }

    /**
     * <p>
     * Specific type of encounter (e.g. e-mail consultation, surgical day-care, skilled nursing, rehabilitation).
     * </p>
     * 
     * @return
     *     A list containing immutable objects of type {@link CodeableConcept}.
     */
    public List<CodeableConcept> getType() {
        return type;
    }

    /**
     * <p>
     * Broad categorization of the service that is to be provided (e.g. cardiology).
     * </p>
     * 
     * @return
     *     An immutable object of type {@link CodeableConcept}.
     */
    public CodeableConcept getServiceType() {
        return serviceType;
    }

    /**
     * <p>
     * Indicates the urgency of the encounter.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link CodeableConcept}.
     */
    public CodeableConcept getPriority() {
        return priority;
    }

    /**
     * <p>
     * The patient or group present at the encounter.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link Reference}.
     */
    public Reference getSubject() {
        return subject;
    }

    /**
     * <p>
     * Where a specific encounter should be classified as a part of a specific episode(s) of care this field should be used. 
     * This association can facilitate grouping of related encounters together for a specific purpose, such as government 
     * reporting, issue tracking, association via a common problem. The association is recorded on the encounter as these are 
     * typically created after the episode of care and grouped on entry rather than editing the episode of care to append 
     * another encounter to it (the episode of care could span years).
     * </p>
     * 
     * @return
     *     A list containing immutable objects of type {@link Reference}.
     */
    public List<Reference> getEpisodeOfCare() {
        return episodeOfCare;
    }

    /**
     * <p>
     * The request this encounter satisfies (e.g. incoming referral or procedure request).
     * </p>
     * 
     * @return
     *     A list containing immutable objects of type {@link Reference}.
     */
    public List<Reference> getBasedOn() {
        return basedOn;
    }

    /**
     * <p>
     * The list of people responsible for providing the service.
     * </p>
     * 
     * @return
     *     A list containing immutable objects of type {@link Participant}.
     */
    public List<Participant> getParticipant() {
        return participant;
    }

    /**
     * <p>
     * The appointment that scheduled this encounter.
     * </p>
     * 
     * @return
     *     A list containing immutable objects of type {@link Reference}.
     */
    public List<Reference> getAppointment() {
        return appointment;
    }

    /**
     * <p>
     * The start and end time of the encounter.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link Period}.
     */
    public Period getPeriod() {
        return period;
    }

    /**
     * <p>
     * Quantity of time the encounter lasted. This excludes the time during leaves of absence.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link Duration}.
     */
    public Duration getLength() {
        return length;
    }

    /**
     * <p>
     * Reason the encounter takes place, expressed as a code. For admissions, this can be used for a coded admission 
     * diagnosis.
     * </p>
     * 
     * @return
     *     A list containing immutable objects of type {@link CodeableConcept}.
     */
    public List<CodeableConcept> getReasonCode() {
        return reasonCode;
    }

    /**
     * <p>
     * Reason the encounter takes place, expressed as a code. For admissions, this can be used for a coded admission 
     * diagnosis.
     * </p>
     * 
     * @return
     *     A list containing immutable objects of type {@link Reference}.
     */
    public List<Reference> getReasonReference() {
        return reasonReference;
    }

    /**
     * <p>
     * The list of diagnosis relevant to this encounter.
     * </p>
     * 
     * @return
     *     A list containing immutable objects of type {@link Diagnosis}.
     */
    public List<Diagnosis> getDiagnosis() {
        return diagnosis;
    }

    /**
     * <p>
     * The set of accounts that may be used for billing for this Encounter.
     * </p>
     * 
     * @return
     *     A list containing immutable objects of type {@link Reference}.
     */
    public List<Reference> getAccount() {
        return account;
    }

    /**
     * <p>
     * Details about the admission to a healthcare service.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link Hospitalization}.
     */
    public Hospitalization getHospitalization() {
        return hospitalization;
    }

    /**
     * <p>
     * List of locations where the patient has been during this encounter.
     * </p>
     * 
     * @return
     *     A list containing immutable objects of type {@link Location}.
     */
    public List<Location> getLocation() {
        return location;
    }

    /**
     * <p>
     * The organization that is primarily responsible for this Encounter's services. This MAY be the same as the organization 
     * on the Patient record, however it could be different, such as if the actor performing the services was from an 
     * external organization (which may be billed seperately) for an external consultation. Refer to the example bundle 
     * showing an abbreviated set of Encounters for a colonoscopy.
     * </p>
     * 
     * @return
     *     An immutable object of type {@link Reference}.
     */
    public Reference getServiceProvider() {
        return serviceProvider;
    }

    /**
     * <p>
     * Another Encounter of which this encounter is a part of (administratively or in time).
     * </p>
     * 
     * @return
     *     An immutable object of type {@link Reference}.
     */
    public Reference getPartOf() {
        return partOf;
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
                accept(statusHistory, "statusHistory", visitor, StatusHistory.class);
                accept(clazz, "class", visitor);
                accept(classHistory, "classHistory", visitor, ClassHistory.class);
                accept(type, "type", visitor, CodeableConcept.class);
                accept(serviceType, "serviceType", visitor);
                accept(priority, "priority", visitor);
                accept(subject, "subject", visitor);
                accept(episodeOfCare, "episodeOfCare", visitor, Reference.class);
                accept(basedOn, "basedOn", visitor, Reference.class);
                accept(participant, "participant", visitor, Participant.class);
                accept(appointment, "appointment", visitor, Reference.class);
                accept(period, "period", visitor);
                accept(length, "length", visitor);
                accept(reasonCode, "reasonCode", visitor, CodeableConcept.class);
                accept(reasonReference, "reasonReference", visitor, Reference.class);
                accept(diagnosis, "diagnosis", visitor, Diagnosis.class);
                accept(account, "account", visitor, Reference.class);
                accept(hospitalization, "hospitalization", visitor);
                accept(location, "location", visitor, Location.class);
                accept(serviceProvider, "serviceProvider", visitor);
                accept(partOf, "partOf", visitor);
            }
            visitor.visitEnd(elementName, this);
            visitor.postVisit(this);
        }
    }

    @Override
    public Builder toBuilder() {
        Builder builder = new Builder(status, clazz);
        builder.id = id;
        builder.meta = meta;
        builder.implicitRules = implicitRules;
        builder.language = language;
        builder.text = text;
        builder.contained.addAll(contained);
        builder.extension.addAll(extension);
        builder.modifierExtension.addAll(modifierExtension);
        builder.identifier.addAll(identifier);
        builder.statusHistory.addAll(statusHistory);
        builder.classHistory.addAll(classHistory);
        builder.type.addAll(type);
        builder.serviceType = serviceType;
        builder.priority = priority;
        builder.subject = subject;
        builder.episodeOfCare.addAll(episodeOfCare);
        builder.basedOn.addAll(basedOn);
        builder.participant.addAll(participant);
        builder.appointment.addAll(appointment);
        builder.period = period;
        builder.length = length;
        builder.reasonCode.addAll(reasonCode);
        builder.reasonReference.addAll(reasonReference);
        builder.diagnosis.addAll(diagnosis);
        builder.account.addAll(account);
        builder.hospitalization = hospitalization;
        builder.location.addAll(location);
        builder.serviceProvider = serviceProvider;
        builder.partOf = partOf;
        return builder;
    }

    public static Builder builder(EncounterStatus status, Coding clazz) {
        return new Builder(status, clazz);
    }

    public static class Builder extends DomainResource.Builder {
        // required
        private final EncounterStatus status;
        private final Coding clazz;

        // optional
        private List<Identifier> identifier = new ArrayList<>();
        private List<StatusHistory> statusHistory = new ArrayList<>();
        private List<ClassHistory> classHistory = new ArrayList<>();
        private List<CodeableConcept> type = new ArrayList<>();
        private CodeableConcept serviceType;
        private CodeableConcept priority;
        private Reference subject;
        private List<Reference> episodeOfCare = new ArrayList<>();
        private List<Reference> basedOn = new ArrayList<>();
        private List<Participant> participant = new ArrayList<>();
        private List<Reference> appointment = new ArrayList<>();
        private Period period;
        private Duration length;
        private List<CodeableConcept> reasonCode = new ArrayList<>();
        private List<Reference> reasonReference = new ArrayList<>();
        private List<Diagnosis> diagnosis = new ArrayList<>();
        private List<Reference> account = new ArrayList<>();
        private Hospitalization hospitalization;
        private List<Location> location = new ArrayList<>();
        private Reference serviceProvider;
        private Reference partOf;

        private Builder(EncounterStatus status, Coding clazz) {
            super();
            this.status = status;
            this.clazz = clazz;
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
         * Identifier(s) by which this encounter is known.
         * </p>
         * 
         * @param identifier
         *     Identifier(s) by which this encounter is known
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
         * Identifier(s) by which this encounter is known.
         * </p>
         * 
         * @param identifier
         *     Identifier(s) by which this encounter is known
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
         * The status history permits the encounter resource to contain the status history without needing to read through the 
         * historical versions of the resource, or even have the server store them.
         * </p>
         * 
         * @param statusHistory
         *     List of past encounter statuses
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder statusHistory(StatusHistory... statusHistory) {
            for (StatusHistory value : statusHistory) {
                this.statusHistory.add(value);
            }
            return this;
        }

        /**
         * <p>
         * The status history permits the encounter resource to contain the status history without needing to read through the 
         * historical versions of the resource, or even have the server store them.
         * </p>
         * 
         * @param statusHistory
         *     List of past encounter statuses
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder statusHistory(Collection<StatusHistory> statusHistory) {
            this.statusHistory.addAll(statusHistory);
            return this;
        }

        /**
         * <p>
         * The class history permits the tracking of the encounters transitions without needing to go through the resource 
         * history. This would be used for a case where an admission starts of as an emergency encounter, then transitions into 
         * an inpatient scenario. Doing this and not restarting a new encounter ensures that any lab/diagnostic results can more 
         * easily follow the patient and not require re-processing and not get lost or cancelled during a kind of discharge from 
         * emergency to inpatient.
         * </p>
         * 
         * @param classHistory
         *     List of past encounter classes
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder classHistory(ClassHistory... classHistory) {
            for (ClassHistory value : classHistory) {
                this.classHistory.add(value);
            }
            return this;
        }

        /**
         * <p>
         * The class history permits the tracking of the encounters transitions without needing to go through the resource 
         * history. This would be used for a case where an admission starts of as an emergency encounter, then transitions into 
         * an inpatient scenario. Doing this and not restarting a new encounter ensures that any lab/diagnostic results can more 
         * easily follow the patient and not require re-processing and not get lost or cancelled during a kind of discharge from 
         * emergency to inpatient.
         * </p>
         * 
         * @param classHistory
         *     List of past encounter classes
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder classHistory(Collection<ClassHistory> classHistory) {
            this.classHistory.addAll(classHistory);
            return this;
        }

        /**
         * <p>
         * Specific type of encounter (e.g. e-mail consultation, surgical day-care, skilled nursing, rehabilitation).
         * </p>
         * 
         * @param type
         *     Specific type of encounter
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder type(CodeableConcept... type) {
            for (CodeableConcept value : type) {
                this.type.add(value);
            }
            return this;
        }

        /**
         * <p>
         * Specific type of encounter (e.g. e-mail consultation, surgical day-care, skilled nursing, rehabilitation).
         * </p>
         * 
         * @param type
         *     Specific type of encounter
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder type(Collection<CodeableConcept> type) {
            this.type.addAll(type);
            return this;
        }

        /**
         * <p>
         * Broad categorization of the service that is to be provided (e.g. cardiology).
         * </p>
         * 
         * @param serviceType
         *     Specific type of service
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder serviceType(CodeableConcept serviceType) {
            this.serviceType = serviceType;
            return this;
        }

        /**
         * <p>
         * Indicates the urgency of the encounter.
         * </p>
         * 
         * @param priority
         *     Indicates the urgency of the encounter
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder priority(CodeableConcept priority) {
            this.priority = priority;
            return this;
        }

        /**
         * <p>
         * The patient or group present at the encounter.
         * </p>
         * 
         * @param subject
         *     The patient or group present at the encounter
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder subject(Reference subject) {
            this.subject = subject;
            return this;
        }

        /**
         * <p>
         * Where a specific encounter should be classified as a part of a specific episode(s) of care this field should be used. 
         * This association can facilitate grouping of related encounters together for a specific purpose, such as government 
         * reporting, issue tracking, association via a common problem. The association is recorded on the encounter as these are 
         * typically created after the episode of care and grouped on entry rather than editing the episode of care to append 
         * another encounter to it (the episode of care could span years).
         * </p>
         * 
         * @param episodeOfCare
         *     Episode(s) of care that this encounter should be recorded against
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder episodeOfCare(Reference... episodeOfCare) {
            for (Reference value : episodeOfCare) {
                this.episodeOfCare.add(value);
            }
            return this;
        }

        /**
         * <p>
         * Where a specific encounter should be classified as a part of a specific episode(s) of care this field should be used. 
         * This association can facilitate grouping of related encounters together for a specific purpose, such as government 
         * reporting, issue tracking, association via a common problem. The association is recorded on the encounter as these are 
         * typically created after the episode of care and grouped on entry rather than editing the episode of care to append 
         * another encounter to it (the episode of care could span years).
         * </p>
         * 
         * @param episodeOfCare
         *     Episode(s) of care that this encounter should be recorded against
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder episodeOfCare(Collection<Reference> episodeOfCare) {
            this.episodeOfCare.addAll(episodeOfCare);
            return this;
        }

        /**
         * <p>
         * The request this encounter satisfies (e.g. incoming referral or procedure request).
         * </p>
         * 
         * @param basedOn
         *     The ServiceRequest that initiated this encounter
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder basedOn(Reference... basedOn) {
            for (Reference value : basedOn) {
                this.basedOn.add(value);
            }
            return this;
        }

        /**
         * <p>
         * The request this encounter satisfies (e.g. incoming referral or procedure request).
         * </p>
         * 
         * @param basedOn
         *     The ServiceRequest that initiated this encounter
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder basedOn(Collection<Reference> basedOn) {
            this.basedOn.addAll(basedOn);
            return this;
        }

        /**
         * <p>
         * The list of people responsible for providing the service.
         * </p>
         * 
         * @param participant
         *     List of participants involved in the encounter
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder participant(Participant... participant) {
            for (Participant value : participant) {
                this.participant.add(value);
            }
            return this;
        }

        /**
         * <p>
         * The list of people responsible for providing the service.
         * </p>
         * 
         * @param participant
         *     List of participants involved in the encounter
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder participant(Collection<Participant> participant) {
            this.participant.addAll(participant);
            return this;
        }

        /**
         * <p>
         * The appointment that scheduled this encounter.
         * </p>
         * 
         * @param appointment
         *     The appointment that scheduled this encounter
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder appointment(Reference... appointment) {
            for (Reference value : appointment) {
                this.appointment.add(value);
            }
            return this;
        }

        /**
         * <p>
         * The appointment that scheduled this encounter.
         * </p>
         * 
         * @param appointment
         *     The appointment that scheduled this encounter
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder appointment(Collection<Reference> appointment) {
            this.appointment.addAll(appointment);
            return this;
        }

        /**
         * <p>
         * The start and end time of the encounter.
         * </p>
         * 
         * @param period
         *     The start and end time of the encounter
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder period(Period period) {
            this.period = period;
            return this;
        }

        /**
         * <p>
         * Quantity of time the encounter lasted. This excludes the time during leaves of absence.
         * </p>
         * 
         * @param length
         *     Quantity of time the encounter lasted (less time absent)
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder length(Duration length) {
            this.length = length;
            return this;
        }

        /**
         * <p>
         * Reason the encounter takes place, expressed as a code. For admissions, this can be used for a coded admission 
         * diagnosis.
         * </p>
         * 
         * @param reasonCode
         *     Coded reason the encounter takes place
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder reasonCode(CodeableConcept... reasonCode) {
            for (CodeableConcept value : reasonCode) {
                this.reasonCode.add(value);
            }
            return this;
        }

        /**
         * <p>
         * Reason the encounter takes place, expressed as a code. For admissions, this can be used for a coded admission 
         * diagnosis.
         * </p>
         * 
         * @param reasonCode
         *     Coded reason the encounter takes place
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder reasonCode(Collection<CodeableConcept> reasonCode) {
            this.reasonCode.addAll(reasonCode);
            return this;
        }

        /**
         * <p>
         * Reason the encounter takes place, expressed as a code. For admissions, this can be used for a coded admission 
         * diagnosis.
         * </p>
         * 
         * @param reasonReference
         *     Reason the encounter takes place (reference)
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder reasonReference(Reference... reasonReference) {
            for (Reference value : reasonReference) {
                this.reasonReference.add(value);
            }
            return this;
        }

        /**
         * <p>
         * Reason the encounter takes place, expressed as a code. For admissions, this can be used for a coded admission 
         * diagnosis.
         * </p>
         * 
         * @param reasonReference
         *     Reason the encounter takes place (reference)
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder reasonReference(Collection<Reference> reasonReference) {
            this.reasonReference.addAll(reasonReference);
            return this;
        }

        /**
         * <p>
         * The list of diagnosis relevant to this encounter.
         * </p>
         * 
         * @param diagnosis
         *     The list of diagnosis relevant to this encounter
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder diagnosis(Diagnosis... diagnosis) {
            for (Diagnosis value : diagnosis) {
                this.diagnosis.add(value);
            }
            return this;
        }

        /**
         * <p>
         * The list of diagnosis relevant to this encounter.
         * </p>
         * 
         * @param diagnosis
         *     The list of diagnosis relevant to this encounter
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder diagnosis(Collection<Diagnosis> diagnosis) {
            this.diagnosis.addAll(diagnosis);
            return this;
        }

        /**
         * <p>
         * The set of accounts that may be used for billing for this Encounter.
         * </p>
         * 
         * @param account
         *     The set of accounts that may be used for billing for this Encounter
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder account(Reference... account) {
            for (Reference value : account) {
                this.account.add(value);
            }
            return this;
        }

        /**
         * <p>
         * The set of accounts that may be used for billing for this Encounter.
         * </p>
         * 
         * @param account
         *     The set of accounts that may be used for billing for this Encounter
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder account(Collection<Reference> account) {
            this.account.addAll(account);
            return this;
        }

        /**
         * <p>
         * Details about the admission to a healthcare service.
         * </p>
         * 
         * @param hospitalization
         *     Details about the admission to a healthcare service
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder hospitalization(Hospitalization hospitalization) {
            this.hospitalization = hospitalization;
            return this;
        }

        /**
         * <p>
         * List of locations where the patient has been during this encounter.
         * </p>
         * 
         * @param location
         *     List of locations where the patient has been
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder location(Location... location) {
            for (Location value : location) {
                this.location.add(value);
            }
            return this;
        }

        /**
         * <p>
         * List of locations where the patient has been during this encounter.
         * </p>
         * 
         * @param location
         *     List of locations where the patient has been
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder location(Collection<Location> location) {
            this.location.addAll(location);
            return this;
        }

        /**
         * <p>
         * The organization that is primarily responsible for this Encounter's services. This MAY be the same as the organization 
         * on the Patient record, however it could be different, such as if the actor performing the services was from an 
         * external organization (which may be billed seperately) for an external consultation. Refer to the example bundle 
         * showing an abbreviated set of Encounters for a colonoscopy.
         * </p>
         * 
         * @param serviceProvider
         *     The organization (facility) responsible for this encounter
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder serviceProvider(Reference serviceProvider) {
            this.serviceProvider = serviceProvider;
            return this;
        }

        /**
         * <p>
         * Another Encounter of which this encounter is a part of (administratively or in time).
         * </p>
         * 
         * @param partOf
         *     Another Encounter this encounter is part of
         * 
         * @return
         *     A reference to this Builder instance.
         */
        public Builder partOf(Reference partOf) {
            this.partOf = partOf;
            return this;
        }

        @Override
        public Encounter build() {
            return new Encounter(this);
        }
    }

    /**
     * <p>
     * The status history permits the encounter resource to contain the status history without needing to read through the 
     * historical versions of the resource, or even have the server store them.
     * </p>
     */
    public static class StatusHistory extends BackboneElement {
        private final EncounterStatus status;
        private final Period period;

        private StatusHistory(Builder builder) {
            super(builder);
            status = ValidationSupport.requireNonNull(builder.status, "status");
            period = ValidationSupport.requireNonNull(builder.period, "period");
        }

        /**
         * <p>
         * planned | arrived | triaged | in-progress | onleave | finished | cancelled +.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link EncounterStatus}.
         */
        public EncounterStatus getStatus() {
            return status;
        }

        /**
         * <p>
         * The time that the episode was in the specified status.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link Period}.
         */
        public Period getPeriod() {
            return period;
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
                    accept(status, "status", visitor);
                    accept(period, "period", visitor);
                }
                visitor.visitEnd(elementName, this);
                visitor.postVisit(this);
            }
        }

        @Override
        public Builder toBuilder() {
            return Builder.from(this);
        }

        public static Builder builder(EncounterStatus status, Period period) {
            return new Builder(status, period);
        }

        public static class Builder extends BackboneElement.Builder {
            // required
            private final EncounterStatus status;
            private final Period period;

            private Builder(EncounterStatus status, Period period) {
                super();
                this.status = status;
                this.period = period;
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

            @Override
            public StatusHistory build() {
                return new StatusHistory(this);
            }

            private static Builder from(StatusHistory statusHistory) {
                Builder builder = new Builder(statusHistory.status, statusHistory.period);
                return builder;
            }
        }
    }

    /**
     * <p>
     * The class history permits the tracking of the encounters transitions without needing to go through the resource 
     * history. This would be used for a case where an admission starts of as an emergency encounter, then transitions into 
     * an inpatient scenario. Doing this and not restarting a new encounter ensures that any lab/diagnostic results can more 
     * easily follow the patient and not require re-processing and not get lost or cancelled during a kind of discharge from 
     * emergency to inpatient.
     * </p>
     */
    public static class ClassHistory extends BackboneElement {
        private final Coding clazz;
        private final Period period;

        private ClassHistory(Builder builder) {
            super(builder);
            clazz = ValidationSupport.requireNonNull(builder.clazz, "class");
            period = ValidationSupport.requireNonNull(builder.period, "period");
        }

        /**
         * <p>
         * inpatient | outpatient | ambulatory | emergency +.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link Coding}.
         */
        public Coding getClazz() {
            return clazz;
        }

        /**
         * <p>
         * The time that the episode was in the specified class.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link Period}.
         */
        public Period getPeriod() {
            return period;
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
                    accept(clazz, "class", visitor);
                    accept(period, "period", visitor);
                }
                visitor.visitEnd(elementName, this);
                visitor.postVisit(this);
            }
        }

        @Override
        public Builder toBuilder() {
            return Builder.from(this);
        }

        public static Builder builder(Coding clazz, Period period) {
            return new Builder(clazz, period);
        }

        public static class Builder extends BackboneElement.Builder {
            // required
            private final Coding clazz;
            private final Period period;

            private Builder(Coding clazz, Period period) {
                super();
                this.clazz = clazz;
                this.period = period;
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

            @Override
            public ClassHistory build() {
                return new ClassHistory(this);
            }

            private static Builder from(ClassHistory classHistory) {
                Builder builder = new Builder(classHistory.clazz, classHistory.period);
                return builder;
            }
        }
    }

    /**
     * <p>
     * The list of people responsible for providing the service.
     * </p>
     */
    public static class Participant extends BackboneElement {
        private final List<CodeableConcept> type;
        private final Period period;
        private final Reference individual;

        private Participant(Builder builder) {
            super(builder);
            type = Collections.unmodifiableList(builder.type);
            period = builder.period;
            individual = builder.individual;
        }

        /**
         * <p>
         * Role of participant in encounter.
         * </p>
         * 
         * @return
         *     A list containing immutable objects of type {@link CodeableConcept}.
         */
        public List<CodeableConcept> getType() {
            return type;
        }

        /**
         * <p>
         * The period of time that the specified participant participated in the encounter. These can overlap or be sub-sets of 
         * the overall encounter's period.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link Period}.
         */
        public Period getPeriod() {
            return period;
        }

        /**
         * <p>
         * Persons involved in the encounter other than the patient.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link Reference}.
         */
        public Reference getIndividual() {
            return individual;
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
                    accept(type, "type", visitor, CodeableConcept.class);
                    accept(period, "period", visitor);
                    accept(individual, "individual", visitor);
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
            private List<CodeableConcept> type = new ArrayList<>();
            private Period period;
            private Reference individual;

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
             * Role of participant in encounter.
             * </p>
             * 
             * @param type
             *     Role of participant in encounter
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder type(CodeableConcept... type) {
                for (CodeableConcept value : type) {
                    this.type.add(value);
                }
                return this;
            }

            /**
             * <p>
             * Role of participant in encounter.
             * </p>
             * 
             * @param type
             *     Role of participant in encounter
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder type(Collection<CodeableConcept> type) {
                this.type.addAll(type);
                return this;
            }

            /**
             * <p>
             * The period of time that the specified participant participated in the encounter. These can overlap or be sub-sets of 
             * the overall encounter's period.
             * </p>
             * 
             * @param period
             *     Period of time during the encounter that the participant participated
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder period(Period period) {
                this.period = period;
                return this;
            }

            /**
             * <p>
             * Persons involved in the encounter other than the patient.
             * </p>
             * 
             * @param individual
             *     Persons involved in the encounter other than the patient
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder individual(Reference individual) {
                this.individual = individual;
                return this;
            }

            @Override
            public Participant build() {
                return new Participant(this);
            }

            private static Builder from(Participant participant) {
                Builder builder = new Builder();
                builder.type.addAll(participant.type);
                builder.period = participant.period;
                builder.individual = participant.individual;
                return builder;
            }
        }
    }

    /**
     * <p>
     * The list of diagnosis relevant to this encounter.
     * </p>
     */
    public static class Diagnosis extends BackboneElement {
        private final Reference condition;
        private final CodeableConcept use;
        private final PositiveInt rank;

        private Diagnosis(Builder builder) {
            super(builder);
            condition = ValidationSupport.requireNonNull(builder.condition, "condition");
            use = builder.use;
            rank = builder.rank;
        }

        /**
         * <p>
         * Reason the encounter takes place, as specified using information from another resource. For admissions, this is the 
         * admission diagnosis. The indication will typically be a Condition (with other resources referenced in the evidence.
         * detail), or a Procedure.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link Reference}.
         */
        public Reference getCondition() {
            return condition;
        }

        /**
         * <p>
         * Role that this diagnosis has within the encounter (e.g. admission, billing, discharge …).
         * </p>
         * 
         * @return
         *     An immutable object of type {@link CodeableConcept}.
         */
        public CodeableConcept getUse() {
            return use;
        }

        /**
         * <p>
         * Ranking of the diagnosis (for each role type).
         * </p>
         * 
         * @return
         *     An immutable object of type {@link PositiveInt}.
         */
        public PositiveInt getRank() {
            return rank;
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
                    accept(condition, "condition", visitor);
                    accept(use, "use", visitor);
                    accept(rank, "rank", visitor);
                }
                visitor.visitEnd(elementName, this);
                visitor.postVisit(this);
            }
        }

        @Override
        public Builder toBuilder() {
            return Builder.from(this);
        }

        public static Builder builder(Reference condition) {
            return new Builder(condition);
        }

        public static class Builder extends BackboneElement.Builder {
            // required
            private final Reference condition;

            // optional
            private CodeableConcept use;
            private PositiveInt rank;

            private Builder(Reference condition) {
                super();
                this.condition = condition;
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
             * Role that this diagnosis has within the encounter (e.g. admission, billing, discharge …).
             * </p>
             * 
             * @param use
             *     Role that this diagnosis has within the encounter (e.g. admission, billing, discharge …)
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder use(CodeableConcept use) {
                this.use = use;
                return this;
            }

            /**
             * <p>
             * Ranking of the diagnosis (for each role type).
             * </p>
             * 
             * @param rank
             *     Ranking of the diagnosis (for each role type)
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder rank(PositiveInt rank) {
                this.rank = rank;
                return this;
            }

            @Override
            public Diagnosis build() {
                return new Diagnosis(this);
            }

            private static Builder from(Diagnosis diagnosis) {
                Builder builder = new Builder(diagnosis.condition);
                builder.use = diagnosis.use;
                builder.rank = diagnosis.rank;
                return builder;
            }
        }
    }

    /**
     * <p>
     * Details about the admission to a healthcare service.
     * </p>
     */
    public static class Hospitalization extends BackboneElement {
        private final Identifier preAdmissionIdentifier;
        private final Reference origin;
        private final CodeableConcept admitSource;
        private final CodeableConcept reAdmission;
        private final List<CodeableConcept> dietPreference;
        private final List<CodeableConcept> specialCourtesy;
        private final List<CodeableConcept> specialArrangement;
        private final Reference destination;
        private final CodeableConcept dischargeDisposition;

        private Hospitalization(Builder builder) {
            super(builder);
            preAdmissionIdentifier = builder.preAdmissionIdentifier;
            origin = builder.origin;
            admitSource = builder.admitSource;
            reAdmission = builder.reAdmission;
            dietPreference = Collections.unmodifiableList(builder.dietPreference);
            specialCourtesy = Collections.unmodifiableList(builder.specialCourtesy);
            specialArrangement = Collections.unmodifiableList(builder.specialArrangement);
            destination = builder.destination;
            dischargeDisposition = builder.dischargeDisposition;
        }

        /**
         * <p>
         * Pre-admission identifier.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link Identifier}.
         */
        public Identifier getPreAdmissionIdentifier() {
            return preAdmissionIdentifier;
        }

        /**
         * <p>
         * The location/organization from which the patient came before admission.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link Reference}.
         */
        public Reference getOrigin() {
            return origin;
        }

        /**
         * <p>
         * From where patient was admitted (physician referral, transfer).
         * </p>
         * 
         * @return
         *     An immutable object of type {@link CodeableConcept}.
         */
        public CodeableConcept getAdmitSource() {
            return admitSource;
        }

        /**
         * <p>
         * Whether this hospitalization is a readmission and why if known.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link CodeableConcept}.
         */
        public CodeableConcept getReAdmission() {
            return reAdmission;
        }

        /**
         * <p>
         * Diet preferences reported by the patient.
         * </p>
         * 
         * @return
         *     A list containing immutable objects of type {@link CodeableConcept}.
         */
        public List<CodeableConcept> getDietPreference() {
            return dietPreference;
        }

        /**
         * <p>
         * Special courtesies (VIP, board member).
         * </p>
         * 
         * @return
         *     A list containing immutable objects of type {@link CodeableConcept}.
         */
        public List<CodeableConcept> getSpecialCourtesy() {
            return specialCourtesy;
        }

        /**
         * <p>
         * Any special requests that have been made for this hospitalization encounter, such as the provision of specific 
         * equipment or other things.
         * </p>
         * 
         * @return
         *     A list containing immutable objects of type {@link CodeableConcept}.
         */
        public List<CodeableConcept> getSpecialArrangement() {
            return specialArrangement;
        }

        /**
         * <p>
         * Location/organization to which the patient is discharged.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link Reference}.
         */
        public Reference getDestination() {
            return destination;
        }

        /**
         * <p>
         * Category or kind of location after discharge.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link CodeableConcept}.
         */
        public CodeableConcept getDischargeDisposition() {
            return dischargeDisposition;
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
                    accept(preAdmissionIdentifier, "preAdmissionIdentifier", visitor);
                    accept(origin, "origin", visitor);
                    accept(admitSource, "admitSource", visitor);
                    accept(reAdmission, "reAdmission", visitor);
                    accept(dietPreference, "dietPreference", visitor, CodeableConcept.class);
                    accept(specialCourtesy, "specialCourtesy", visitor, CodeableConcept.class);
                    accept(specialArrangement, "specialArrangement", visitor, CodeableConcept.class);
                    accept(destination, "destination", visitor);
                    accept(dischargeDisposition, "dischargeDisposition", visitor);
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
            private Identifier preAdmissionIdentifier;
            private Reference origin;
            private CodeableConcept admitSource;
            private CodeableConcept reAdmission;
            private List<CodeableConcept> dietPreference = new ArrayList<>();
            private List<CodeableConcept> specialCourtesy = new ArrayList<>();
            private List<CodeableConcept> specialArrangement = new ArrayList<>();
            private Reference destination;
            private CodeableConcept dischargeDisposition;

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
             * Pre-admission identifier.
             * </p>
             * 
             * @param preAdmissionIdentifier
             *     Pre-admission identifier
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder preAdmissionIdentifier(Identifier preAdmissionIdentifier) {
                this.preAdmissionIdentifier = preAdmissionIdentifier;
                return this;
            }

            /**
             * <p>
             * The location/organization from which the patient came before admission.
             * </p>
             * 
             * @param origin
             *     The location/organization from which the patient came before admission
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder origin(Reference origin) {
                this.origin = origin;
                return this;
            }

            /**
             * <p>
             * From where patient was admitted (physician referral, transfer).
             * </p>
             * 
             * @param admitSource
             *     From where patient was admitted (physician referral, transfer)
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder admitSource(CodeableConcept admitSource) {
                this.admitSource = admitSource;
                return this;
            }

            /**
             * <p>
             * Whether this hospitalization is a readmission and why if known.
             * </p>
             * 
             * @param reAdmission
             *     The type of hospital re-admission that has occurred (if any). If the value is absent, then this is not identified as a 
             *     readmission
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder reAdmission(CodeableConcept reAdmission) {
                this.reAdmission = reAdmission;
                return this;
            }

            /**
             * <p>
             * Diet preferences reported by the patient.
             * </p>
             * 
             * @param dietPreference
             *     Diet preferences reported by the patient
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder dietPreference(CodeableConcept... dietPreference) {
                for (CodeableConcept value : dietPreference) {
                    this.dietPreference.add(value);
                }
                return this;
            }

            /**
             * <p>
             * Diet preferences reported by the patient.
             * </p>
             * 
             * @param dietPreference
             *     Diet preferences reported by the patient
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder dietPreference(Collection<CodeableConcept> dietPreference) {
                this.dietPreference.addAll(dietPreference);
                return this;
            }

            /**
             * <p>
             * Special courtesies (VIP, board member).
             * </p>
             * 
             * @param specialCourtesy
             *     Special courtesies (VIP, board member)
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder specialCourtesy(CodeableConcept... specialCourtesy) {
                for (CodeableConcept value : specialCourtesy) {
                    this.specialCourtesy.add(value);
                }
                return this;
            }

            /**
             * <p>
             * Special courtesies (VIP, board member).
             * </p>
             * 
             * @param specialCourtesy
             *     Special courtesies (VIP, board member)
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder specialCourtesy(Collection<CodeableConcept> specialCourtesy) {
                this.specialCourtesy.addAll(specialCourtesy);
                return this;
            }

            /**
             * <p>
             * Any special requests that have been made for this hospitalization encounter, such as the provision of specific 
             * equipment or other things.
             * </p>
             * 
             * @param specialArrangement
             *     Wheelchair, translator, stretcher, etc.
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder specialArrangement(CodeableConcept... specialArrangement) {
                for (CodeableConcept value : specialArrangement) {
                    this.specialArrangement.add(value);
                }
                return this;
            }

            /**
             * <p>
             * Any special requests that have been made for this hospitalization encounter, such as the provision of specific 
             * equipment or other things.
             * </p>
             * 
             * @param specialArrangement
             *     Wheelchair, translator, stretcher, etc.
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder specialArrangement(Collection<CodeableConcept> specialArrangement) {
                this.specialArrangement.addAll(specialArrangement);
                return this;
            }

            /**
             * <p>
             * Location/organization to which the patient is discharged.
             * </p>
             * 
             * @param destination
             *     Location/organization to which the patient is discharged
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder destination(Reference destination) {
                this.destination = destination;
                return this;
            }

            /**
             * <p>
             * Category or kind of location after discharge.
             * </p>
             * 
             * @param dischargeDisposition
             *     Category or kind of location after discharge
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder dischargeDisposition(CodeableConcept dischargeDisposition) {
                this.dischargeDisposition = dischargeDisposition;
                return this;
            }

            @Override
            public Hospitalization build() {
                return new Hospitalization(this);
            }

            private static Builder from(Hospitalization hospitalization) {
                Builder builder = new Builder();
                builder.preAdmissionIdentifier = hospitalization.preAdmissionIdentifier;
                builder.origin = hospitalization.origin;
                builder.admitSource = hospitalization.admitSource;
                builder.reAdmission = hospitalization.reAdmission;
                builder.dietPreference.addAll(hospitalization.dietPreference);
                builder.specialCourtesy.addAll(hospitalization.specialCourtesy);
                builder.specialArrangement.addAll(hospitalization.specialArrangement);
                builder.destination = hospitalization.destination;
                builder.dischargeDisposition = hospitalization.dischargeDisposition;
                return builder;
            }
        }
    }

    /**
     * <p>
     * List of locations where the patient has been during this encounter.
     * </p>
     */
    public static class Location extends BackboneElement {
        private final Reference location;
        private final EncounterLocationStatus status;
        private final CodeableConcept physicalType;
        private final Period period;

        private Location(Builder builder) {
            super(builder);
            location = ValidationSupport.requireNonNull(builder.location, "location");
            status = builder.status;
            physicalType = builder.physicalType;
            period = builder.period;
        }

        /**
         * <p>
         * The location where the encounter takes place.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link Reference}.
         */
        public Reference getLocation() {
            return location;
        }

        /**
         * <p>
         * The status of the participants' presence at the specified location during the period specified. If the participant is 
         * no longer at the location, then the period will have an end date/time.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link EncounterLocationStatus}.
         */
        public EncounterLocationStatus getStatus() {
            return status;
        }

        /**
         * <p>
         * This will be used to specify the required levels (bed/ward/room/etc.) desired to be recorded to simplify either 
         * messaging or query.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link CodeableConcept}.
         */
        public CodeableConcept getPhysicalType() {
            return physicalType;
        }

        /**
         * <p>
         * Time period during which the patient was present at the location.
         * </p>
         * 
         * @return
         *     An immutable object of type {@link Period}.
         */
        public Period getPeriod() {
            return period;
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
                    accept(location, "location", visitor);
                    accept(status, "status", visitor);
                    accept(physicalType, "physicalType", visitor);
                    accept(period, "period", visitor);
                }
                visitor.visitEnd(elementName, this);
                visitor.postVisit(this);
            }
        }

        @Override
        public Builder toBuilder() {
            return Builder.from(this);
        }

        public static Builder builder(Reference location) {
            return new Builder(location);
        }

        public static class Builder extends BackboneElement.Builder {
            // required
            private final Reference location;

            // optional
            private EncounterLocationStatus status;
            private CodeableConcept physicalType;
            private Period period;

            private Builder(Reference location) {
                super();
                this.location = location;
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
             * The status of the participants' presence at the specified location during the period specified. If the participant is 
             * no longer at the location, then the period will have an end date/time.
             * </p>
             * 
             * @param status
             *     planned | active | reserved | completed
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder status(EncounterLocationStatus status) {
                this.status = status;
                return this;
            }

            /**
             * <p>
             * This will be used to specify the required levels (bed/ward/room/etc.) desired to be recorded to simplify either 
             * messaging or query.
             * </p>
             * 
             * @param physicalType
             *     The physical type of the location (usually the level in the location hierachy - bed room ward etc.)
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder physicalType(CodeableConcept physicalType) {
                this.physicalType = physicalType;
                return this;
            }

            /**
             * <p>
             * Time period during which the patient was present at the location.
             * </p>
             * 
             * @param period
             *     Time period during which the patient was present at the location
             * 
             * @return
             *     A reference to this Builder instance.
             */
            public Builder period(Period period) {
                this.period = period;
                return this;
            }

            @Override
            public Location build() {
                return new Location(this);
            }

            private static Builder from(Location location) {
                Builder builder = new Builder(location.location);
                builder.status = location.status;
                builder.physicalType = location.physicalType;
                builder.period = location.period;
                return builder;
            }
        }
    }
}
