package com.day02.chatlogparser;

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class IdleMessageFilter implements MessageFilter<String> {

	private static final Set<String> IDLE_KEYWORDS = new HashSet<>(
			Arrays.asList("lol", "haha", "brb", "gtg", "ok", "kk", "xd", "lmao", "rofl", "ty", "np", "gm", "gn"));

	@Override
	public boolean shouldKeep(String message) {
		String lower = message.toLowerCase().trim();

		if (lower.length() < 5 || IDLE_KEYWORDS.contains(lower)) {
			return false;
		}

		for (String word : IDLE_KEYWORDS) {
			if (lower.contains(word)) {
				return false;
			}
		}

		return true;
	}
}
