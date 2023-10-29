// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;
import us.hebi.quickbuf.RepeatedMessage;

public final class NpcRogueInfoOuterClass {
  /**
   * Protobuf type {@code NpcRogueInfo}
   */
  public static final class NpcRogueInfo extends ProtoMessage<NpcRogueInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 dialogue_group_id = 1;</code>
     */
    private int dialogueGroupId;

    /**
     * <code>optional uint32 KCPOHLMKMFH = 3;</code>
     */
    private int kCPOHLMKMFH;

    /**
     * <code>optional uint32 rogue_npc_id = 5;</code>
     */
    private int rogueNpcId;

    /**
     * <pre>
     * repeated IICJAGOKIMP ALFIOHKDPLJ = 2;
     * </pre>
     *
     * <code>optional uint32 ODGHKLBCEOF = 13;</code>
     */
    private int oDGHKLBCEOF;

    /**
     * <code>optional bool IAJLMEKFNMO = 8;</code>
     */
    private boolean iAJLMEKFNMO;

    /**
     * <code>optional bool NHEENJEGNLL = 10;</code>
     */
    private boolean nHEENJEGNLL;

    /**
     * <code>repeated .NpcRogueInfo.JGJHOEBINDPEntry JGJHOEBINDP = 12;</code>
     */
    private final RepeatedMessage<JGJHOEBINDPEntry> jGJHOEBINDP = RepeatedMessage.newEmptyInstance(JGJHOEBINDPEntry.getFactory());

    private NpcRogueInfo() {
    }

    /**
     * @return a new empty instance of {@code NpcRogueInfo}
     */
    public static NpcRogueInfo newInstance() {
      return new NpcRogueInfo();
    }

    /**
     * <code>optional uint32 dialogue_group_id = 1;</code>
     * @return whether the dialogueGroupId field is set
     */
    public boolean hasDialogueGroupId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 dialogue_group_id = 1;</code>
     * @return this
     */
    public NpcRogueInfo clearDialogueGroupId() {
      bitField0_ &= ~0x00000001;
      dialogueGroupId = 0;
      return this;
    }

    /**
     * <code>optional uint32 dialogue_group_id = 1;</code>
     * @return the dialogueGroupId
     */
    public int getDialogueGroupId() {
      return dialogueGroupId;
    }

    /**
     * <code>optional uint32 dialogue_group_id = 1;</code>
     * @param value the dialogueGroupId to set
     * @return this
     */
    public NpcRogueInfo setDialogueGroupId(final int value) {
      bitField0_ |= 0x00000001;
      dialogueGroupId = value;
      return this;
    }

    /**
     * <code>optional uint32 KCPOHLMKMFH = 3;</code>
     * @return whether the kCPOHLMKMFH field is set
     */
    public boolean hasKCPOHLMKMFH() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 KCPOHLMKMFH = 3;</code>
     * @return this
     */
    public NpcRogueInfo clearKCPOHLMKMFH() {
      bitField0_ &= ~0x00000002;
      kCPOHLMKMFH = 0;
      return this;
    }

    /**
     * <code>optional uint32 KCPOHLMKMFH = 3;</code>
     * @return the kCPOHLMKMFH
     */
    public int getKCPOHLMKMFH() {
      return kCPOHLMKMFH;
    }

    /**
     * <code>optional uint32 KCPOHLMKMFH = 3;</code>
     * @param value the kCPOHLMKMFH to set
     * @return this
     */
    public NpcRogueInfo setKCPOHLMKMFH(final int value) {
      bitField0_ |= 0x00000002;
      kCPOHLMKMFH = value;
      return this;
    }

    /**
     * <code>optional uint32 rogue_npc_id = 5;</code>
     * @return whether the rogueNpcId field is set
     */
    public boolean hasRogueNpcId() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 rogue_npc_id = 5;</code>
     * @return this
     */
    public NpcRogueInfo clearRogueNpcId() {
      bitField0_ &= ~0x00000004;
      rogueNpcId = 0;
      return this;
    }

    /**
     * <code>optional uint32 rogue_npc_id = 5;</code>
     * @return the rogueNpcId
     */
    public int getRogueNpcId() {
      return rogueNpcId;
    }

    /**
     * <code>optional uint32 rogue_npc_id = 5;</code>
     * @param value the rogueNpcId to set
     * @return this
     */
    public NpcRogueInfo setRogueNpcId(final int value) {
      bitField0_ |= 0x00000004;
      rogueNpcId = value;
      return this;
    }

    /**
     * <pre>
     * repeated IICJAGOKIMP ALFIOHKDPLJ = 2;
     * </pre>
     *
     * <code>optional uint32 ODGHKLBCEOF = 13;</code>
     * @return whether the oDGHKLBCEOF field is set
     */
    public boolean hasODGHKLBCEOF() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <pre>
     * repeated IICJAGOKIMP ALFIOHKDPLJ = 2;
     * </pre>
     *
     * <code>optional uint32 ODGHKLBCEOF = 13;</code>
     * @return this
     */
    public NpcRogueInfo clearODGHKLBCEOF() {
      bitField0_ &= ~0x00000008;
      oDGHKLBCEOF = 0;
      return this;
    }

    /**
     * <pre>
     * repeated IICJAGOKIMP ALFIOHKDPLJ = 2;
     * </pre>
     *
     * <code>optional uint32 ODGHKLBCEOF = 13;</code>
     * @return the oDGHKLBCEOF
     */
    public int getODGHKLBCEOF() {
      return oDGHKLBCEOF;
    }

    /**
     * <pre>
     * repeated IICJAGOKIMP ALFIOHKDPLJ = 2;
     * </pre>
     *
     * <code>optional uint32 ODGHKLBCEOF = 13;</code>
     * @param value the oDGHKLBCEOF to set
     * @return this
     */
    public NpcRogueInfo setODGHKLBCEOF(final int value) {
      bitField0_ |= 0x00000008;
      oDGHKLBCEOF = value;
      return this;
    }

    /**
     * <code>optional bool IAJLMEKFNMO = 8;</code>
     * @return whether the iAJLMEKFNMO field is set
     */
    public boolean hasIAJLMEKFNMO() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <code>optional bool IAJLMEKFNMO = 8;</code>
     * @return this
     */
    public NpcRogueInfo clearIAJLMEKFNMO() {
      bitField0_ &= ~0x00000010;
      iAJLMEKFNMO = false;
      return this;
    }

    /**
     * <code>optional bool IAJLMEKFNMO = 8;</code>
     * @return the iAJLMEKFNMO
     */
    public boolean getIAJLMEKFNMO() {
      return iAJLMEKFNMO;
    }

    /**
     * <code>optional bool IAJLMEKFNMO = 8;</code>
     * @param value the iAJLMEKFNMO to set
     * @return this
     */
    public NpcRogueInfo setIAJLMEKFNMO(final boolean value) {
      bitField0_ |= 0x00000010;
      iAJLMEKFNMO = value;
      return this;
    }

    /**
     * <code>optional bool NHEENJEGNLL = 10;</code>
     * @return whether the nHEENJEGNLL field is set
     */
    public boolean hasNHEENJEGNLL() {
      return (bitField0_ & 0x00000020) != 0;
    }

    /**
     * <code>optional bool NHEENJEGNLL = 10;</code>
     * @return this
     */
    public NpcRogueInfo clearNHEENJEGNLL() {
      bitField0_ &= ~0x00000020;
      nHEENJEGNLL = false;
      return this;
    }

    /**
     * <code>optional bool NHEENJEGNLL = 10;</code>
     * @return the nHEENJEGNLL
     */
    public boolean getNHEENJEGNLL() {
      return nHEENJEGNLL;
    }

    /**
     * <code>optional bool NHEENJEGNLL = 10;</code>
     * @param value the nHEENJEGNLL to set
     * @return this
     */
    public NpcRogueInfo setNHEENJEGNLL(final boolean value) {
      bitField0_ |= 0x00000020;
      nHEENJEGNLL = value;
      return this;
    }

    /**
     * <code>repeated .NpcRogueInfo.JGJHOEBINDPEntry JGJHOEBINDP = 12;</code>
     * @return whether the jGJHOEBINDP field is set
     */
    public boolean hasJGJHOEBINDP() {
      return (bitField0_ & 0x00000040) != 0;
    }

    /**
     * <code>repeated .NpcRogueInfo.JGJHOEBINDPEntry JGJHOEBINDP = 12;</code>
     * @return this
     */
    public NpcRogueInfo clearJGJHOEBINDP() {
      bitField0_ &= ~0x00000040;
      jGJHOEBINDP.clear();
      return this;
    }

    /**
     * <code>repeated .NpcRogueInfo.JGJHOEBINDPEntry JGJHOEBINDP = 12;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableJGJHOEBINDP()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<JGJHOEBINDPEntry> getJGJHOEBINDP() {
      return jGJHOEBINDP;
    }

    /**
     * <code>repeated .NpcRogueInfo.JGJHOEBINDPEntry JGJHOEBINDP = 12;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<JGJHOEBINDPEntry> getMutableJGJHOEBINDP() {
      bitField0_ |= 0x00000040;
      return jGJHOEBINDP;
    }

    /**
     * <code>repeated .NpcRogueInfo.JGJHOEBINDPEntry JGJHOEBINDP = 12;</code>
     * @param value the jGJHOEBINDP to add
     * @return this
     */
    public NpcRogueInfo addJGJHOEBINDP(final JGJHOEBINDPEntry value) {
      bitField0_ |= 0x00000040;
      jGJHOEBINDP.add(value);
      return this;
    }

    /**
     * <code>repeated .NpcRogueInfo.JGJHOEBINDPEntry JGJHOEBINDP = 12;</code>
     * @param values the jGJHOEBINDP to add
     * @return this
     */
    public NpcRogueInfo addAllJGJHOEBINDP(final JGJHOEBINDPEntry... values) {
      bitField0_ |= 0x00000040;
      jGJHOEBINDP.addAll(values);
      return this;
    }

    @Override
    public NpcRogueInfo copyFrom(final NpcRogueInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        dialogueGroupId = other.dialogueGroupId;
        kCPOHLMKMFH = other.kCPOHLMKMFH;
        rogueNpcId = other.rogueNpcId;
        oDGHKLBCEOF = other.oDGHKLBCEOF;
        iAJLMEKFNMO = other.iAJLMEKFNMO;
        nHEENJEGNLL = other.nHEENJEGNLL;
        jGJHOEBINDP.copyFrom(other.jGJHOEBINDP);
      }
      return this;
    }

    @Override
    public NpcRogueInfo mergeFrom(final NpcRogueInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasDialogueGroupId()) {
        setDialogueGroupId(other.dialogueGroupId);
      }
      if (other.hasKCPOHLMKMFH()) {
        setKCPOHLMKMFH(other.kCPOHLMKMFH);
      }
      if (other.hasRogueNpcId()) {
        setRogueNpcId(other.rogueNpcId);
      }
      if (other.hasODGHKLBCEOF()) {
        setODGHKLBCEOF(other.oDGHKLBCEOF);
      }
      if (other.hasIAJLMEKFNMO()) {
        setIAJLMEKFNMO(other.iAJLMEKFNMO);
      }
      if (other.hasNHEENJEGNLL()) {
        setNHEENJEGNLL(other.nHEENJEGNLL);
      }
      if (other.hasJGJHOEBINDP()) {
        getMutableJGJHOEBINDP().addAll(other.jGJHOEBINDP);
      }
      return this;
    }

    @Override
    public NpcRogueInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      dialogueGroupId = 0;
      kCPOHLMKMFH = 0;
      rogueNpcId = 0;
      oDGHKLBCEOF = 0;
      iAJLMEKFNMO = false;
      nHEENJEGNLL = false;
      jGJHOEBINDP.clear();
      return this;
    }

    @Override
    public NpcRogueInfo clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      jGJHOEBINDP.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof NpcRogueInfo)) {
        return false;
      }
      NpcRogueInfo other = (NpcRogueInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasDialogueGroupId() || dialogueGroupId == other.dialogueGroupId)
        && (!hasKCPOHLMKMFH() || kCPOHLMKMFH == other.kCPOHLMKMFH)
        && (!hasRogueNpcId() || rogueNpcId == other.rogueNpcId)
        && (!hasODGHKLBCEOF() || oDGHKLBCEOF == other.oDGHKLBCEOF)
        && (!hasIAJLMEKFNMO() || iAJLMEKFNMO == other.iAJLMEKFNMO)
        && (!hasNHEENJEGNLL() || nHEENJEGNLL == other.nHEENJEGNLL)
        && (!hasJGJHOEBINDP() || jGJHOEBINDP.equals(other.jGJHOEBINDP));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 8);
        output.writeUInt32NoTag(dialogueGroupId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 24);
        output.writeUInt32NoTag(kCPOHLMKMFH);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 40);
        output.writeUInt32NoTag(rogueNpcId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 104);
        output.writeUInt32NoTag(oDGHKLBCEOF);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRawByte((byte) 64);
        output.writeBoolNoTag(iAJLMEKFNMO);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeRawByte((byte) 80);
        output.writeBoolNoTag(nHEENJEGNLL);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        for (int i = 0; i < jGJHOEBINDP.length(); i++) {
          output.writeRawByte((byte) 98);
          output.writeMessageNoTag(jGJHOEBINDP.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(dialogueGroupId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(kCPOHLMKMFH);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(rogueNpcId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(oDGHKLBCEOF);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += 2;
      }
      if ((bitField0_ & 0x00000020) != 0) {
        size += 2;
      }
      if ((bitField0_ & 0x00000040) != 0) {
        size += (1 * jGJHOEBINDP.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(jGJHOEBINDP);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public NpcRogueInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 8: {
            // dialogueGroupId
            dialogueGroupId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 24) {
              break;
            }
          }
          case 24: {
            // kCPOHLMKMFH
            kCPOHLMKMFH = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 40) {
              break;
            }
          }
          case 40: {
            // rogueNpcId
            rogueNpcId = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 104) {
              break;
            }
          }
          case 104: {
            // oDGHKLBCEOF
            oDGHKLBCEOF = input.readUInt32();
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 64) {
              break;
            }
          }
          case 64: {
            // iAJLMEKFNMO
            iAJLMEKFNMO = input.readBool();
            bitField0_ |= 0x00000010;
            tag = input.readTag();
            if (tag != 80) {
              break;
            }
          }
          case 80: {
            // nHEENJEGNLL
            nHEENJEGNLL = input.readBool();
            bitField0_ |= 0x00000020;
            tag = input.readTag();
            if (tag != 98) {
              break;
            }
          }
          case 98: {
            // jGJHOEBINDP
            tag = input.readRepeatedMessage(jGJHOEBINDP, tag);
            bitField0_ |= 0x00000040;
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.dialogueGroupId, dialogueGroupId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.kCPOHLMKMFH, kCPOHLMKMFH);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.rogueNpcId, rogueNpcId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeUInt32(FieldNames.oDGHKLBCEOF, oDGHKLBCEOF);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeBool(FieldNames.iAJLMEKFNMO, iAJLMEKFNMO);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeBool(FieldNames.nHEENJEGNLL, nHEENJEGNLL);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        output.writeRepeatedMessage(FieldNames.jGJHOEBINDP, jGJHOEBINDP);
      }
      output.endObject();
    }

    @Override
    public NpcRogueInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1758320386:
          case 1899979106: {
            if (input.isAtField(FieldNames.dialogueGroupId)) {
              if (!input.trySkipNullValue()) {
                dialogueGroupId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1491718070: {
            if (input.isAtField(FieldNames.kCPOHLMKMFH)) {
              if (!input.trySkipNullValue()) {
                kCPOHLMKMFH = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1140086238:
          case 1751967038: {
            if (input.isAtField(FieldNames.rogueNpcId)) {
              if (!input.trySkipNullValue()) {
                rogueNpcId = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 826923524: {
            if (input.isAtField(FieldNames.oDGHKLBCEOF)) {
              if (!input.trySkipNullValue()) {
                oDGHKLBCEOF = input.readUInt32();
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1849806077: {
            if (input.isAtField(FieldNames.iAJLMEKFNMO)) {
              if (!input.trySkipNullValue()) {
                iAJLMEKFNMO = input.readBool();
                bitField0_ |= 0x00000010;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1462517482: {
            if (input.isAtField(FieldNames.nHEENJEGNLL)) {
              if (!input.trySkipNullValue()) {
                nHEENJEGNLL = input.readBool();
                bitField0_ |= 0x00000020;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1440360446: {
            if (input.isAtField(FieldNames.jGJHOEBINDP)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(jGJHOEBINDP);
                bitField0_ |= 0x00000040;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public NpcRogueInfo clone() {
      return new NpcRogueInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static NpcRogueInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new NpcRogueInfo(), data).checkInitialized();
    }

    public static NpcRogueInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new NpcRogueInfo(), input).checkInitialized();
    }

    public static NpcRogueInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new NpcRogueInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating NpcRogueInfo messages
     */
    public static MessageFactory<NpcRogueInfo> getFactory() {
      return NpcRogueInfoFactory.INSTANCE;
    }

    /**
     * Protobuf type {@code JGJHOEBINDPEntry}
     */
    public static final class JGJHOEBINDPEntry extends ProtoMessage<JGJHOEBINDPEntry> implements Cloneable {
      private static final long serialVersionUID = 0L;

      /**
       * <code>optional uint32 key = 1;</code>
       */
      private int key;

      /**
       * <code>optional uint32 value = 2;</code>
       */
      private int value_;

      private JGJHOEBINDPEntry() {
      }

      /**
       * @return a new empty instance of {@code JGJHOEBINDPEntry}
       */
      public static JGJHOEBINDPEntry newInstance() {
        return new JGJHOEBINDPEntry();
      }

      /**
       * <code>optional uint32 key = 1;</code>
       * @return whether the key field is set
       */
      public boolean hasKey() {
        return (bitField0_ & 0x00000001) != 0;
      }

      /**
       * <code>optional uint32 key = 1;</code>
       * @return this
       */
      public JGJHOEBINDPEntry clearKey() {
        bitField0_ &= ~0x00000001;
        key = 0;
        return this;
      }

      /**
       * <code>optional uint32 key = 1;</code>
       * @return the key
       */
      public int getKey() {
        return key;
      }

      /**
       * <code>optional uint32 key = 1;</code>
       * @param value the key to set
       * @return this
       */
      public JGJHOEBINDPEntry setKey(final int value) {
        bitField0_ |= 0x00000001;
        key = value;
        return this;
      }

      /**
       * <code>optional uint32 value = 2;</code>
       * @return whether the value_ field is set
       */
      public boolean hasValue() {
        return (bitField0_ & 0x00000002) != 0;
      }

      /**
       * <code>optional uint32 value = 2;</code>
       * @return this
       */
      public JGJHOEBINDPEntry clearValue() {
        bitField0_ &= ~0x00000002;
        value_ = 0;
        return this;
      }

      /**
       * <code>optional uint32 value = 2;</code>
       * @return the value_
       */
      public int getValue() {
        return value_;
      }

      /**
       * <code>optional uint32 value = 2;</code>
       * @param value the value_ to set
       * @return this
       */
      public JGJHOEBINDPEntry setValue(final int value) {
        bitField0_ |= 0x00000002;
        value_ = value;
        return this;
      }

      @Override
      public JGJHOEBINDPEntry copyFrom(final JGJHOEBINDPEntry other) {
        cachedSize = other.cachedSize;
        if ((bitField0_ | other.bitField0_) != 0) {
          bitField0_ = other.bitField0_;
          key = other.key;
          value_ = other.value_;
        }
        return this;
      }

      @Override
      public JGJHOEBINDPEntry mergeFrom(final JGJHOEBINDPEntry other) {
        if (other.isEmpty()) {
          return this;
        }
        cachedSize = -1;
        if (other.hasKey()) {
          setKey(other.key);
        }
        if (other.hasValue()) {
          setValue(other.value_);
        }
        return this;
      }

      @Override
      public JGJHOEBINDPEntry clear() {
        if (isEmpty()) {
          return this;
        }
        cachedSize = -1;
        bitField0_ = 0;
        key = 0;
        value_ = 0;
        return this;
      }

      @Override
      public JGJHOEBINDPEntry clearQuick() {
        if (isEmpty()) {
          return this;
        }
        cachedSize = -1;
        bitField0_ = 0;
        return this;
      }

      @Override
      public boolean equals(Object o) {
        if (o == this) {
          return true;
        }
        if (!(o instanceof JGJHOEBINDPEntry)) {
          return false;
        }
        JGJHOEBINDPEntry other = (JGJHOEBINDPEntry) o;
        return bitField0_ == other.bitField0_
          && (!hasKey() || key == other.key)
          && (!hasValue() || value_ == other.value_);
      }

      @Override
      public void writeTo(final ProtoSink output) throws IOException {
        if ((bitField0_ & 0x00000001) != 0) {
          output.writeRawByte((byte) 8);
          output.writeUInt32NoTag(key);
        }
        if ((bitField0_ & 0x00000002) != 0) {
          output.writeRawByte((byte) 16);
          output.writeUInt32NoTag(value_);
        }
      }

      @Override
      protected int computeSerializedSize() {
        int size = 0;
        if ((bitField0_ & 0x00000001) != 0) {
          size += 1 + ProtoSink.computeUInt32SizeNoTag(key);
        }
        if ((bitField0_ & 0x00000002) != 0) {
          size += 1 + ProtoSink.computeUInt32SizeNoTag(value_);
        }
        return size;
      }

      @Override
      @SuppressWarnings("fallthrough")
      public JGJHOEBINDPEntry mergeFrom(final ProtoSource input) throws IOException {
        // Enabled Fall-Through Optimization (QuickBuffers)
        int tag = input.readTag();
        while (true) {
          switch (tag) {
            case 8: {
              // key
              key = input.readUInt32();
              bitField0_ |= 0x00000001;
              tag = input.readTag();
              if (tag != 16) {
                break;
              }
            }
            case 16: {
              // value_
              value_ = input.readUInt32();
              bitField0_ |= 0x00000002;
              tag = input.readTag();
              if (tag != 0) {
                break;
              }
            }
            case 0: {
              return this;
            }
            default: {
              if (!input.skipField(tag)) {
                return this;
              }
              tag = input.readTag();
              break;
            }
          }
        }
      }

      @Override
      public void writeTo(final JsonSink output) throws IOException {
        output.beginObject();
        if ((bitField0_ & 0x00000001) != 0) {
          output.writeUInt32(FieldNames.key, key);
        }
        if ((bitField0_ & 0x00000002) != 0) {
          output.writeUInt32(FieldNames.value_, value_);
        }
        output.endObject();
      }

      @Override
      public JGJHOEBINDPEntry mergeFrom(final JsonSource input) throws IOException {
        if (!input.beginObject()) {
          return this;
        }
        while (!input.isAtEnd()) {
          switch (input.readFieldHash()) {
            case 106079: {
              if (input.isAtField(FieldNames.key)) {
                if (!input.trySkipNullValue()) {
                  key = input.readUInt32();
                  bitField0_ |= 0x00000001;
                }
              } else {
                input.skipUnknownField();
              }
              break;
            }
            case 111972721: {
              if (input.isAtField(FieldNames.value_)) {
                if (!input.trySkipNullValue()) {
                  value_ = input.readUInt32();
                  bitField0_ |= 0x00000002;
                }
              } else {
                input.skipUnknownField();
              }
              break;
            }
            default: {
              input.skipUnknownField();
              break;
            }
          }
        }
        input.endObject();
        return this;
      }

      @Override
      public JGJHOEBINDPEntry clone() {
        return new JGJHOEBINDPEntry().copyFrom(this);
      }

      @Override
      public boolean isEmpty() {
        return ((bitField0_) == 0);
      }

      public static JGJHOEBINDPEntry parseFrom(final byte[] data) throws
          InvalidProtocolBufferException {
        return ProtoMessage.mergeFrom(new JGJHOEBINDPEntry(), data).checkInitialized();
      }

      public static JGJHOEBINDPEntry parseFrom(final ProtoSource input) throws IOException {
        return ProtoMessage.mergeFrom(new JGJHOEBINDPEntry(), input).checkInitialized();
      }

      public static JGJHOEBINDPEntry parseFrom(final JsonSource input) throws IOException {
        return ProtoMessage.mergeFrom(new JGJHOEBINDPEntry(), input).checkInitialized();
      }

      /**
       * @return factory for creating JGJHOEBINDPEntry messages
       */
      public static MessageFactory<JGJHOEBINDPEntry> getFactory() {
        return JGJHOEBINDPEntryFactory.INSTANCE;
      }

      private enum JGJHOEBINDPEntryFactory implements MessageFactory<JGJHOEBINDPEntry> {
        INSTANCE;

        @Override
        public JGJHOEBINDPEntry create() {
          return JGJHOEBINDPEntry.newInstance();
        }
      }

      /**
       * Contains name constants used for serializing JSON
       */
      static class FieldNames {
        static final FieldName key = FieldName.forField("key");

        static final FieldName value_ = FieldName.forField("value");
      }
    }

    private enum NpcRogueInfoFactory implements MessageFactory<NpcRogueInfo> {
      INSTANCE;

      @Override
      public NpcRogueInfo create() {
        return NpcRogueInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName dialogueGroupId = FieldName.forField("dialogueGroupId", "dialogue_group_id");

      static final FieldName kCPOHLMKMFH = FieldName.forField("KCPOHLMKMFH");

      static final FieldName rogueNpcId = FieldName.forField("rogueNpcId", "rogue_npc_id");

      static final FieldName oDGHKLBCEOF = FieldName.forField("ODGHKLBCEOF");

      static final FieldName iAJLMEKFNMO = FieldName.forField("IAJLMEKFNMO");

      static final FieldName nHEENJEGNLL = FieldName.forField("NHEENJEGNLL");

      static final FieldName jGJHOEBINDP = FieldName.forField("JGJHOEBINDP");
    }
  }
}
