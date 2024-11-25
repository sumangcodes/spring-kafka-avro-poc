/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.example.spring_kafka_avro.dto;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class Doctor extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 1596339363618937177L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Doctor\",\"namespace\":\"com.example.spring_kafka_avro.dto\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",{\"type\":\"long\",\"java-class\":\"java.lang.Long\"}]},{\"name\":\"name\",\"type\":[\"null\",\"string\"]},{\"name\":\"specialty\",\"type\":[\"null\",\"string\"]},{\"name\":\"yearsOfExperience\",\"type\":{\"type\":\"int\",\"java-class\":\"java.lang.Integer\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Doctor> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Doctor> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Doctor> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Doctor> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Doctor> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Doctor to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Doctor from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Doctor instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Doctor fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.Long id;
  private java.lang.CharSequence name;
  private java.lang.CharSequence specialty;
  private int yearsOfExperience;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Doctor() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param name The new value for name
   * @param specialty The new value for specialty
   * @param yearsOfExperience The new value for yearsOfExperience
   */
  public Doctor(java.lang.Long id, java.lang.CharSequence name, java.lang.CharSequence specialty, java.lang.Integer yearsOfExperience) {
    this.id = id;
    this.name = name;
    this.specialty = specialty;
    this.yearsOfExperience = yearsOfExperience;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return name;
    case 2: return specialty;
    case 3: return yearsOfExperience;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.Long)value$; break;
    case 1: name = (java.lang.CharSequence)value$; break;
    case 2: specialty = (java.lang.CharSequence)value$; break;
    case 3: yearsOfExperience = (java.lang.Integer)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public java.lang.Long getId() {
    return id;
  }


  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.Long value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'name' field.
   * @return The value of the 'name' field.
   */
  public java.lang.CharSequence getName() {
    return name;
  }


  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'specialty' field.
   * @return The value of the 'specialty' field.
   */
  public java.lang.CharSequence getSpecialty() {
    return specialty;
  }


  /**
   * Sets the value of the 'specialty' field.
   * @param value the value to set.
   */
  public void setSpecialty(java.lang.CharSequence value) {
    this.specialty = value;
  }

  /**
   * Gets the value of the 'yearsOfExperience' field.
   * @return The value of the 'yearsOfExperience' field.
   */
  public int getYearsOfExperience() {
    return yearsOfExperience;
  }


  /**
   * Sets the value of the 'yearsOfExperience' field.
   * @param value the value to set.
   */
  public void setYearsOfExperience(int value) {
    this.yearsOfExperience = value;
  }

  /**
   * Creates a new Doctor RecordBuilder.
   * @return A new Doctor RecordBuilder
   */
  public static com.example.spring_kafka_avro.dto.Doctor.Builder newBuilder() {
    return new com.example.spring_kafka_avro.dto.Doctor.Builder();
  }

  /**
   * Creates a new Doctor RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Doctor RecordBuilder
   */
  public static com.example.spring_kafka_avro.dto.Doctor.Builder newBuilder(com.example.spring_kafka_avro.dto.Doctor.Builder other) {
    if (other == null) {
      return new com.example.spring_kafka_avro.dto.Doctor.Builder();
    } else {
      return new com.example.spring_kafka_avro.dto.Doctor.Builder(other);
    }
  }

  /**
   * Creates a new Doctor RecordBuilder by copying an existing Doctor instance.
   * @param other The existing instance to copy.
   * @return A new Doctor RecordBuilder
   */
  public static com.example.spring_kafka_avro.dto.Doctor.Builder newBuilder(com.example.spring_kafka_avro.dto.Doctor other) {
    if (other == null) {
      return new com.example.spring_kafka_avro.dto.Doctor.Builder();
    } else {
      return new com.example.spring_kafka_avro.dto.Doctor.Builder(other);
    }
  }

  /**
   * RecordBuilder for Doctor instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Doctor>
    implements org.apache.avro.data.RecordBuilder<Doctor> {

    private java.lang.Long id;
    private java.lang.CharSequence name;
    private java.lang.CharSequence specialty;
    private int yearsOfExperience;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.example.spring_kafka_avro.dto.Doctor.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.specialty)) {
        this.specialty = data().deepCopy(fields()[2].schema(), other.specialty);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.yearsOfExperience)) {
        this.yearsOfExperience = data().deepCopy(fields()[3].schema(), other.yearsOfExperience);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
    }

    /**
     * Creates a Builder by copying an existing Doctor instance
     * @param other The existing instance to copy.
     */
    private Builder(com.example.spring_kafka_avro.dto.Doctor other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.specialty)) {
        this.specialty = data().deepCopy(fields()[2].schema(), other.specialty);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.yearsOfExperience)) {
        this.yearsOfExperience = data().deepCopy(fields()[3].schema(), other.yearsOfExperience);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public java.lang.Long getId() {
      return id;
    }


    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public com.example.spring_kafka_avro.dto.Doctor.Builder setId(java.lang.Long value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public com.example.spring_kafka_avro.dto.Doctor.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public java.lang.CharSequence getName() {
      return name;
    }


    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public com.example.spring_kafka_avro.dto.Doctor.Builder setName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.name = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public com.example.spring_kafka_avro.dto.Doctor.Builder clearName() {
      name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'specialty' field.
      * @return The value.
      */
    public java.lang.CharSequence getSpecialty() {
      return specialty;
    }


    /**
      * Sets the value of the 'specialty' field.
      * @param value The value of 'specialty'.
      * @return This builder.
      */
    public com.example.spring_kafka_avro.dto.Doctor.Builder setSpecialty(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.specialty = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'specialty' field has been set.
      * @return True if the 'specialty' field has been set, false otherwise.
      */
    public boolean hasSpecialty() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'specialty' field.
      * @return This builder.
      */
    public com.example.spring_kafka_avro.dto.Doctor.Builder clearSpecialty() {
      specialty = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'yearsOfExperience' field.
      * @return The value.
      */
    public int getYearsOfExperience() {
      return yearsOfExperience;
    }


    /**
      * Sets the value of the 'yearsOfExperience' field.
      * @param value The value of 'yearsOfExperience'.
      * @return This builder.
      */
    public com.example.spring_kafka_avro.dto.Doctor.Builder setYearsOfExperience(int value) {
      validate(fields()[3], value);
      this.yearsOfExperience = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'yearsOfExperience' field has been set.
      * @return True if the 'yearsOfExperience' field has been set, false otherwise.
      */
    public boolean hasYearsOfExperience() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'yearsOfExperience' field.
      * @return This builder.
      */
    public com.example.spring_kafka_avro.dto.Doctor.Builder clearYearsOfExperience() {
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Doctor build() {
      try {
        Doctor record = new Doctor();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.Long) defaultValue(fields()[0]);
        record.name = fieldSetFlags()[1] ? this.name : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.specialty = fieldSetFlags()[2] ? this.specialty : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.yearsOfExperience = fieldSetFlags()[3] ? this.yearsOfExperience : (java.lang.Integer) defaultValue(fields()[3]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Doctor>
    WRITER$ = (org.apache.avro.io.DatumWriter<Doctor>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Doctor>
    READER$ = (org.apache.avro.io.DatumReader<Doctor>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    if (this.id == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeLong(this.id);
    }

    if (this.name == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.name);
    }

    if (this.specialty == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.specialty);
    }

    out.writeInt(this.yearsOfExperience);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (in.readIndex() != 1) {
        in.readNull();
        this.id = null;
      } else {
        this.id = in.readLong();
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.name = null;
      } else {
        this.name = in.readString(this.name instanceof Utf8 ? (Utf8)this.name : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.specialty = null;
      } else {
        this.specialty = in.readString(this.specialty instanceof Utf8 ? (Utf8)this.specialty : null);
      }

      this.yearsOfExperience = in.readInt();

    } else {
      for (int i = 0; i < 4; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (in.readIndex() != 1) {
            in.readNull();
            this.id = null;
          } else {
            this.id = in.readLong();
          }
          break;

        case 1:
          if (in.readIndex() != 1) {
            in.readNull();
            this.name = null;
          } else {
            this.name = in.readString(this.name instanceof Utf8 ? (Utf8)this.name : null);
          }
          break;

        case 2:
          if (in.readIndex() != 1) {
            in.readNull();
            this.specialty = null;
          } else {
            this.specialty = in.readString(this.specialty instanceof Utf8 ? (Utf8)this.specialty : null);
          }
          break;

        case 3:
          this.yearsOfExperience = in.readInt();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










