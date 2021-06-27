package tddbc;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class StrawberryTest {

	@Nested
	@DisplayName("品種とサイズを指定したいちごが取得できること")
	public class 品種とサイズを指定したいちごが取得できること {

		@Test
		@DisplayName("いちご（品種：あまおうとサイズ：S）からサイズenum（S）が取得できること")
		public void いちご_品種_あまおうとサイズ_S_からサイズenum_S_が取得できること() throws Exception {
			// Setup
			Strawberry sut = new Strawberry(Strawberry.Varieties.AMAOU, Strawberry.Sizes.S);
			// Excercise & Verify
			assertEquals(Strawberry.Sizes.S, sut.getSizeEnum());
		}

//		@Test
//		@DisplayName("いちご（品種：あまおうとサイズenum：S）からサイズ（S）が取得できること")
//		public void いちご_品種_あまおうとサイズ_S_からサイズ_S_が取得できることenum() throws Exception {
//			// Setup
//			Strawberry sut = new Strawberry(Strawberry.Varieties.AMAOU, Strawberry.Sizes.S);
//			// Exercise
//			String actual = sut.getSize();
//			// Verify
//			assertEquals("S", actual);
//		}

		@Test
		@DisplayName("いちご（品種：あまおうとサイズenum：S）から品種（あまおう）が取得できること")
		public void いちご_品種_あまおうとサイズ_S_から品種_あまおう_が取得できることenum() throws Exception {
			// Setup
			Strawberry sut = new Strawberry(Strawberry.Varieties.AMAOU, Strawberry.Sizes.S);
			// Exercise
			String actual = sut.getVariety();
			// Verify
			assertEquals("あまおう", actual);
		}
//		@Test
//		@DisplayName("いちご（品種：あまおうとサイズ：S）からサイズ（S）が取得できること")
//		public void いちご_品種_あまおうとサイズ_S_からサイズ_S_が取得できること() throws Exception {
//			// Setup
//			Strawberry sut = new Strawberry(Strawberry.Varieties.AMAOU, "S");
//			// Exercise
//			String actual = sut.getSize();
//			// Verify
//			assertEquals("S", actual);
//		}

//		@Test
//		@DisplayName("いちご（品種：あまおうとサイズ：S）から品種（あまおう）が取得できること")
//		public void いちご_品種_あまおうとサイズ_S_から品種_あまおう_が取得できること() throws Exception {
//			// Setup
//			Strawberry sut = new Strawberry(Strawberry.Varieties.AMAOU, "S");
//			// Exercise
//			String actual = sut.getVariety();
//			// Verify
//			assertEquals("あまおう", actual);
//		}
	}

	@Nested
	@DisplayName("いちごの文字列表現を取得できること")
	public class いちごの文字列表現を取得できること {
		@Test
		@DisplayName("いちご（品種：あまおうとサイズ：S）文字列表現_\"あまおう: S\"を取得できること")
		public void いちご_品種_あまおうとサイズ_S_から文字列表現_あまおう_S_を取得できること() throws Exception {
			// Setup
			Strawberry sut = new Strawberry(Strawberry.Varieties.AMAOU, "S");
			// Exercise
			String actual = sut.getVarietyAndSize();
			// Verify
			assertEquals("あまおう: S", actual);
		}
		@Test
		@DisplayName("いちご（品種：あまおうとサイズenum：S）文字列表現_\"あまおう: S\"を取得できること")
		public void いちご_品種_あまおうとサイズ_S_から文字列表現_あまおう_S_を取得できることenum() throws Exception {
			// Setup
			Strawberry sut = new Strawberry(Strawberry.Varieties.AMAOU, Strawberry.Sizes.S);
			// Exercise
			String actual = sut.getVarietyAndSize();
			// Verify
			assertEquals("あまおう: S", actual);
		}
	}

	@Nested
	@DisplayName("品種と重さを指定したいちごが取得できること")
	public class 品種と重さを指定したいちごが取得できること {

		@Nested
		@DisplayName("いちごからサイズが取得できること")
		public class いちごからサイズが取得できる {
			@Test
			@DisplayName("いちご（品種：あまおうと重さ： 1.0g）からサイズ(S)のいちごが取得できること")
			public void いちご_品種_あまおうと重さ_1_0_からサイズ_S_が取得できること() throws Exception {
				// Setup
				Strawberry sut = new Strawberry(Strawberry.Varieties.AMAOU, new BigDecimal("1.0"));
				// Exercise & Verify
				assertEquals("S", sut.getSize());
			}

			@Test
			@DisplayName("いちご（品種：あまおうと重さ：10.0g）からサイズ(M)のいちごが取得できること")
			public void いちご_品種_あまおうと重さ_10_0_からサイズ_M_が取得できること() throws Exception {
				// Setup
				Strawberry sut = new Strawberry(Strawberry.Varieties.AMAOU, new BigDecimal("10.0"));
				// Exercise & Verify
				assertEquals("M", sut.getSize());
			}

			@Test
			@DisplayName("いちご（品種：あまおうと重さ：20.0g）からサイズ(L)のいちごが取得できること")
			public void いちご_品種_あまおうと重さ_20_0_からサイズ_L_が取得できること() throws Exception {
				// Setup
				Strawberry sut = new Strawberry(Strawberry.Varieties.AMAOU, new BigDecimal("20.0"));
				// Exercise & Verify
				assertEquals("L", sut.getSize());
			}

			@Test
			@DisplayName("いちご（品種：あまおうと重さ：25.0g）からサイズ(LL)のいちごが取得できること")
			public void いちご_品種_あまおうと重さ_25_0_からサイズ_LL_が取得できること() throws Exception {
				// Setup
				Strawberry sut = new Strawberry(Strawberry.Varieties.AMAOU, new BigDecimal("25.0"));
				// Exercise & Verify
				assertEquals("LL", sut.getSize());
			}
		}

		@Nested
		@DisplayName("いちごから品種が取得できること")
		public class いちごから品種が取得できる {
			@Test
			@DisplayName("いちご（品種：あまおうと重さ： 1.0g）から品種(あまおう)のいちごが取得できること")
			public void いちご_品種_あまおうと重さ_1_0_から品種_あまおう_が取得できること() throws Exception {
				// Setup
				Strawberry sut = new Strawberry(Strawberry.Varieties.AMAOU, new BigDecimal("1.0"));
				// Exercise & Verify
				assertEquals(Strawberry.Varieties.AMAOU, sut.getVarietyEnum());
			}
		}
	}


}
