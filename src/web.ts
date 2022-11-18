import { WebPlugin } from '@capacitor/core';

import type {
  PlacePickerOptions,
  PlacePickerPlugin,
  PlacePickerResults,
} from './definitions';

export class PlacePickerWeb extends WebPlugin implements PlacePickerPlugin {
  async pickPlace(_: PlacePickerOptions): Promise<PlacePickerResults> {
    return JSON.stringify(_) as any;
  }
}
