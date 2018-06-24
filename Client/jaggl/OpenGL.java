/* OpenGL - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaggl;

import java.awt.Canvas;
import java.util.Hashtable;

public class OpenGL {
	private Hashtable<String, String> a;
	private static Hashtable<Thread, OpenGL> b = new Hashtable<Thread, OpenGL>();
	long peer;
	private Thread c;

	public static final native void glGetIntegerv(int i, int[] is, int i_0_);

	public static final native int glGenLists(int i);

	public static final native void glTexSubImage2Df(int i, int i_1_, int i_2_,
			int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, float[] fs,
			int i_8_);

	public static final native void glGenTextures(int i, int[] is, int i_9_);

	public static final native void glBindTexture(int i, int i_10_);

	private final native boolean attachPeer();

	public static final native void glColorPointer(int i, int i_11_, int i_12_,
			long l);

	public static final native void glGetTexImageub(int i, int i_13_,
			int i_14_, int i_15_, byte[] is, int i_16_);

	public final native void releasePbuffer(long l);

	public static final native void glPolygonMode(int i, int i_17_);

	public static final native void glProgramRawARB(int i, int i_18_, byte[] is);

	public static final native void glDeleteLists(int i, int i_19_);

	public final native void setPbuffer(long l);

	public static final native void glMultiTexCoord2f(int i, float f,
			float f_20_);

	public static final native void glRasterPos2i(int i, int i_21_);

	public static final native void glDrawBuffersARB(int i, int[] is, int i_22_);

	public static final native void glCompileShaderARB(long l);

	public static final native void glTexEnvfv(int i, int i_23_, float[] fs,
			int i_24_);

	public static final native void glDeleteRenderbuffersEXT(int i, int[] is,
			int i_25_);

	public static final native void glGetProgramivARB(int i, int i_26_,
			int[] is, int i_27_);

	public static final native void glShadeModel(int i);

	public static final native void glHint(int i, int i_28_);

	public static final native void glBlendFunc(int i, int i_29_);

	public static final native void glUniform1iARB(int i, int i_30_);

	public static final native void glLoadMatrixf(float[] fs, int i);

	public static final native int glGetError();

	public static final native void glColor4f(float f, float f_31_,
			float f_32_, float f_33_);

	public static final native void glBufferSubDataARBa(int i, int i_34_,
			int i_35_, long l);

	public static final native void glNormal3f(float f, float f_36_, float f_37_);

	public static final native void glNormalPointer(int i, int i_38_, long l);

	public static final native int glGetUniformLocationARB(long l, String string);

	public static final native void glEndList();

	public static final native void glLightf(int i, int i_39_, float f);

	public final native boolean setSurface(long l);

	public static final native void glActiveTexture(int i);

	public static final native void glCopyTexSubImage2D(int i, int i_40_,
			int i_41_, int i_42_, int i_43_, int i_44_, int i_45_, int i_46_);

	public static final native String glGetString(int i);

	public static final native long glCreateProgramObjectARB();

	public static final native int glGenProgramARB();

	public static final native void glStencilOp(int i, int i_47_, int i_48_);

	public static final native void glProgramLocalParameter4fARB(int i,
			int i_49_, float f, float f_50_, float f_51_, float f_52_);

	public static final native void glTexSubImage2Di(int i, int i_53_,
			int i_54_, int i_55_, int i_56_, int i_57_, int i_58_, int i_59_,
			int[] is, int i_60_);

	public static final native void glUseProgramObjectARB(long l);

	public static final native void glGenFramebuffersEXT(int i, int[] is,
			int i_61_);

	public static final native void glAttachObjectARB(long l, long l_62_);

	public static final native void glTexParameteri(int i, int i_63_, int i_64_);

	public static final native void glTexImage2Df(int i, int i_65_, int i_66_,
			int i_67_, int i_68_, int i_69_, int i_70_, int i_71_, float[] fs,
			int i_72_);

	static final native boolean glUnmapBufferARB(int i);

	public static final native void glFogfv(int i, float[] fs, int i_73_);

	public final native void setSwapInterval(int i);

	public static final native void glDeleteBuffersARB(int i, int[] is,
			int i_74_);

	public static final native void glShaderSourceRawARB(long l, byte[] is);

	public static final native void glDepthFunc(int i);

	public static final native void glDeleteObjectARB(long l);

	public static final native void glGetObjectParameterivARB(long l, int i,
			int[] is, int i_75_);

	public final synchronized boolean a() {
		try {
			if (c != Thread.currentThread())
				return false;
			detachPeer();
			b.remove(c);
			c = null;
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public static final native void glDeleteProgramARB(int i);

	public static final native void glTexCoord3i(int i, int i_76_, int i_77_);

	public static final native void glClearDepth(float f);

	public static final native void glLinkProgramARB(long l);

	public static final native void glGetInfoLogARB(long l, int i, int[] is,
			int i_78_, byte[] is_79_, int i_80_);

	public static final native void glScalef(float f, float f_81_, float f_82_);

	public static final native void glLightModelfv(int i, float[] fs, int i_83_);

	public static final native void glDisable(int i);

	public static final native void glFlush();

	public static final native void glMatrixMode(int i);

	public static final native void glDrawPixelsi(int i, int i_84_, int i_85_,
			int i_86_, int[] is, int i_87_);

	public static final native void glTexGeni(int i, int i_88_, int i_89_);

	public static final native void glDrawBuffer(int i);

	public static final native void glUniformMatrix3fvARB(int i, int i_90_,
			boolean bool, float[] fs, int i_91_);

	public static final native void glMultMatrixf(float[] fs, int i);

	public static final native void glBindFramebufferEXT(int i, int i_92_);

	public static final native void glDrawArrays(int i, int i_93_, int i_94_);

	public static final native void glTexGenfv(int i, int i_95_, float[] fs,
			int i_96_);

	public static final native long glCreateShaderObjectARB(int i);

	public static final native void glPushMatrix();

	public final native void releaseSurface(Canvas canvas, long l);

	public static final native void glCullFace(int i);

	public static final native void glGenerateMipmapEXT(int i);

	public static final native void glColor4ub(byte i, byte i_97_, byte i_98_,
			byte i_99_);

	public static final native void glUniformMatrix4fvARB(int i, int i_100_,
			boolean bool, float[] fs, int i_101_);

	public static final native void glPopAttrib();

	public static final native void glPushAttrib(int i);

	public static final native void glPixelTransferf(int i, float f);

	public static final native void glBindRenderbufferEXT(int i, int i_102_);

	public static final native void glFramebufferRenderbufferEXT(int i,
			int i_103_, int i_104_, int i_105_);

	public static final native void glBufferDataARBub(int i, int i_106_,
			byte[] is, int i_107_, int i_108_);

	public static final native void glTexImage1Dub(int i, int i_109_,
			int i_110_, int i_111_, int i_112_, int i_113_, int i_114_,
			byte[] is, int i_115_);

	public final native long prepareSurface(Canvas canvas);

	public static final native void glVertex3f(float f, float f_116_,
			float f_117_);

	public final native void surfaceResized(long l);

	public static final native void glTexEnvf(int i, int i_118_, float f);

	public static final native void glOrtho(double d, double d_119_,
			double d_120_, double d_121_, double d_122_, double d_123_);

	public static final native void glFogf(int i, float f);

	public static final native void glReadPixelsi(int i, int i_124_,
			int i_125_, int i_126_, int i_127_, int i_128_, int[] is, int i_129_);

	public final native long init(Canvas canvas, int i, int i_130_, int i_131_,
			int i_132_, int i_133_, int i_134_);

	public static final native void glScissor(int i, int i_135_, int i_136_,
			int i_137_);

	public static final native void glFinish();

	public static final native void glTexImage2Di(int i, int i_138_,
			int i_139_, int i_140_, int i_141_, int i_142_, int i_143_,
			int i_144_, int[] is, int i_145_);

	public static final native void glGenRenderbuffersEXT(int i, int[] is,
			int i_146_);

	public static final native void glTexCoord2f(float f, float f_147_);

	public static final native void glCallList(int i);

	public static final native void glColor3ub(byte i, byte i_148_, byte i_149_);

	public static final native void glDrawElements(int i, int i_150_,
			int i_151_, long l);

	public static final native void glPixelZoom(float f, float f_152_);

	public static final native void glMultiTexCoord3i(int i, int i_153_,
			int i_154_, int i_155_);

	public static final native void glGenBuffersARB(int i, int[] is, int i_156_);

	public static final native void glBufferDataARBa(int i, int i_157_, long l,
			int i_158_);

	public static final native void glDeleteFramebuffersEXT(int i, int[] is,
			int i_159_);

	public static final native void glFogi(int i, int i_160_);

	public static final native void glClientActiveTexture(int i);

	public final native boolean arePbuffersAvailable();

	public static final native void glTexCoordPointer(int i, int i_161_,
			int i_162_, long l);

	public static final native void glVertexPointer(int i, int i_163_,
			int i_164_, long l);

	public static final native void glBindBufferARB(int i, int i_165_);

	public static final native void glProgramLocalParameter4fvARB(int i,
			int i_166_, float[] fs, int i_167_);

	public static final native void glGetFloatv(int i, float[] fs, int i_168_);

	public static final native void glCopyPixels(int i, int i_169_, int i_170_,
			int i_171_, int i_172_);

	public static final native void glDetachObjectARB(long l, long l_173_);

	public static final native void glTexParameterf(int i, int i_174_, float f);

	public final boolean a(final String string) {
		try {
			if (a == null) {
				a = new Hashtable<String, String>();
				final String string_175_ = glGetString(7939);
				int i = 0;
				for (;;) {
					final int i_176_ = string_175_.indexOf(' ', i);
					if ((i_176_ ^ 0xffffffff) == 0)
						break;
					final String string_177_ = string_175_.substring(i, i_176_)
							.trim();
					i = 1 + i_176_;
					if (string_177_.length() != 0)
						a.put(string_177_, string_177_);
				}
				final String string_178_ = string_175_.substring(i).trim();
				if ((string_178_.length() ^ 0xffffffff) != -1)
					a.put(string_178_, string_178_);
			}
			return a.containsKey(string);
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public static final native void glRenderbufferStorageEXT(int i, int i_179_,
			int i_180_, int i_181_);

	public static final native void glAlphaFunc(int i, float f);

	public static final native void glProgramStringARB(int i, int i_182_,
			String string);

	public static final native void glRenderbufferStorageMultisampleEXT(int i,
			int i_183_, int i_184_, int i_185_, int i_186_);

	public static final native void glUniform4fARB(int i, float f,
			float f_187_, float f_188_, float f_189_);

	public static final native void glNewList(int i, int i_190_);

	public static final native void glEnable(int i);

	public static final native void glStencilFunc(int i, int i_191_, int i_192_);

	public static final native void glUniform1fARB(int i, float f);

	private final native void detachPeer();

	public final native long createPbuffer(int i, int i_193_);

	public static final native void glUniformMatrix2fvARB(int i, int i_194_,
			boolean bool, float[] fs, int i_195_);

	public static final native void glTexImage3Dub(int i, int i_196_,
			int i_197_, int i_198_, int i_199_, int i_200_, int i_201_,
			int i_202_, int i_203_, byte[] is, int i_204_);

	public static final native void glColorMask(boolean bool,
			boolean bool_205_, boolean bool_206_, boolean bool_207_);

	public final native void release();

	public static final native void glTexCoord3f(float f, float f_208_,
			float f_209_);

	public static final native void glDrawPixelsub(int i, int i_210_,
			int i_211_, int i_212_, byte[] is, int i_213_);

	public static final native void glBlitFramebufferEXT(int i, int i_214_,
			int i_215_, int i_216_, int i_217_, int i_218_, int i_219_,
			int i_220_, int i_221_, int i_222_);

	public static final native void glReadPixelsub(int i, int i_223_,
			int i_224_, int i_225_, int i_226_, int i_227_, byte[] is,
			int i_228_);

	public static final native void glRotatef(float f, float f_229_,
			float f_230_, float f_231_);

	public static final native void glClearColor(float f, float f_232_,
			float f_233_, float f_234_);

	public static final native void glClear(int i);

	public static final native void glTexEnvi(int i, int i_235_, int i_236_);

	public static final native void glDepthMask(boolean bool);

	public static final native void glDeleteTextures(int i, int[] is, int i_237_);

	public static final native void glEnd();

	public static final native void glMaterialfv(int i, int i_238_, float[] fs,
			int i_239_);

	public static final native void glMultiTexCoord2i(int i, int i_240_,
			int i_241_);

	public static final native void glPointSize(float f);

	public static final native void glPopMatrix();

	public final synchronized boolean b() {
		try {
			final Thread thread = Thread.currentThread();
			if (attachPeer()) {
				final OpenGL opengl_242_ = (OpenGL) b.put(thread, this);
				if (opengl_242_ != null)
					opengl_242_.c = null;
				c = thread;
				return true;
			}
			return false;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public static final native void glBindProgramARB(int i, int i_243_);

	public static final native void glBegin(int i);

	public static final native void glUniform2fARB(int i, float f, float f_244_);

	public static final native void glEnableClientState(int i);

	public static final native void glCopyTexSubImage3D(int i, int i_245_,
			int i_246_, int i_247_, int i_248_, int i_249_, int i_250_,
			int i_251_, int i_252_);

	public static final native void glFrustum(double d, double d_253_,
			double d_254_, double d_255_, double d_256_, double d_257_);

	static final native long glMapBufferARB(int i, int i_258_);

	public static final native void glVertex2i(int i, int i_259_);

	public static final native void glTexImage2Dub(int i, int i_260_,
			int i_261_, int i_262_, int i_263_, int i_264_, int i_265_,
			int i_266_, byte[] is, int i_267_);

	public static final native void glLoadIdentity();

	public static final native void glPixelStorei(int i, int i_268_);

	public static final native int glCheckFramebufferStatusEXT(int i);

	public static final native void glCopyTexImage2D(int i, int i_269_,
			int i_270_, int i_271_, int i_272_, int i_273_, int i_274_,
			int i_275_);

	public static final native void glVertex2f(float f, float f_276_);

	public static final native void glBufferSubDataARBub(int i, int i_277_,
			int i_278_, byte[] is, int i_279_);

	public static final native void glViewport(int i, int i_280_, int i_281_,
			int i_282_);

	public static final native void glFramebufferTexture3DEXT(int i,
			int i_283_, int i_284_, int i_285_, int i_286_, int i_287_);

	public static final native void glColor3f(float f, float f_288_,
			float f_289_);

	public static final native void glUniform3fARB(int i, float f,
			float f_290_, float f_291_);

	public static final native void glTexSubImage2Dub(int i, int i_292_,
			int i_293_, int i_294_, int i_295_, int i_296_, int i_297_,
			int i_298_, byte[] is, int i_299_);

	public static final native void glGetTexImagei(int i, int i_300_,
			int i_301_, int i_302_, int[] is, int i_303_);

	public final native void swapBuffers();

	public static final native void glFramebufferTexture2DEXT(int i,
			int i_304_, int i_305_, int i_306_, int i_307_);

	public static final native void glLineWidth(float f);

	public static final native void glShaderSourceARB(long l, String string);

	public static final native void glTranslatef(float f, float f_308_,
			float f_309_);

	public static final native void glDisableClientState(int i);

	public static final native void glColorMaterial(int i, int i_310_);

	public static final native void glTexCoord2i(int i, int i_311_);

	public static final native void glReadBuffer(int i);

	public static final native void glLightfv(int i, int i_312_, float[] fs,
			int i_313_);
}
